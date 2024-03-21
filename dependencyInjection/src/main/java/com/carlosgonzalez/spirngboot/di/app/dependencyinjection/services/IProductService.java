package com.carlosgonzalez.spirngboot.di.app.dependencyinjection.services;

import com.carlosgonzalez.spirngboot.di.app.dependencyinjection.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(Long id);
}
