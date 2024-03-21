package com.carlosgonzalez.spirngboot.di.app.dependencyinjection.controllers;

import com.carlosgonzalez.spirngboot.di.app.dependencyinjection.models.Product;
import com.carlosgonzalez.spirngboot.di.app.dependencyinjection.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SomeControllers {

    @Autowired
    private IProductService productService;

    @GetMapping
    public List<Product> list(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id){
        return productService.findById(id);
    }
}
