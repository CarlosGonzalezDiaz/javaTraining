package com.carlosgonzalez.spirngboot.di.app.dependencyinjection.repositories;


import com.carlosgonzalez.spirngboot.di.app.dependencyinjection.models.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Repository("productListNew")
public class ProductRepositoryJson implements IProductRepository{

    private List<Product> list;
    public ProductRepositoryJson() {
        Resource resource = new ClassPathResource("product.json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            list = Arrays.asList(objectMapper.readValue(resource.getFile(), Product[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    @Override
    public Product findById(Long id) {
        return list.stream().filter(product -> {
            return product.getId().equals(id);
        }).findFirst().orElseThrow();
    }
}
