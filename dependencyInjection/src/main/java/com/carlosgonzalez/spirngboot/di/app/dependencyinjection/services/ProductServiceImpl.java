package com.carlosgonzalez.spirngboot.di.app.dependencyinjection.services;

import com.carlosgonzalez.spirngboot.di.app.dependencyinjection.models.Product;
import com.carlosgonzalez.spirngboot.di.app.dependencyinjection.repositories.IProductRepository;
import com.carlosgonzalez.spirngboot.di.app.dependencyinjection.repositories.ProductRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private Environment environment;

    @Qualifier("productListNew")
    @Autowired
    private IProductRepository productRepositoryImpl;

    @Override
    public List<Product> findAll(){
        return productRepositoryImpl.findAll().stream().map(product -> {
            Double priceTax = product.getPrice() *environment.getProperty("config.price.tax",Double.class);
            //Product newProd = new Product(product.getId(), product.getName(), priceImp.longValue());

            Product newProd = (Product) product.clone();
            newProd.setPrice(priceTax.longValue());
            return newProd;

//            product.setPrice(priceTax.longValue());
//            return product;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id){
        return productRepositoryImpl.findById(id);
    }

}
