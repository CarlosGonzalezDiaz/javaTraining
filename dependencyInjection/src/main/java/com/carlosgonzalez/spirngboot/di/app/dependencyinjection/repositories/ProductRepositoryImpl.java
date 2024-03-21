package com.carlosgonzalez.spirngboot.di.app.dependencyinjection.repositories;

import com.carlosgonzalez.spirngboot.di.app.dependencyinjection.models.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Arrays;
import java.util.List;

//@RequestScope
//@SessionScope
@Repository("productList")
public class ProductRepositoryImpl implements IProductRepository{
    private List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
                new Product(1L,"Memoria Corsair",350L),
                new Product(2L,"CPU Intel CoreI9",850L),
                new Product(3L,"Teclado Razer Mini",180L ),
                new Product(4L,"Motherboard Gigabite",490L)
        );
    }

    @Override
    public List<Product> findAll(){
        return data;
    }

    @Override
    public Product findById(Long id){
        return data.stream().filter(product -> product.getId().equals(id)).findFirst().orElseThrow();
    }
}
