package com.carlosgonzalez.spirngboot.di.app.dependencyinjection.repositories;

import com.carlosgonzalez.spirngboot.di.app.dependencyinjection.models.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    Product findById(Long id);
}
