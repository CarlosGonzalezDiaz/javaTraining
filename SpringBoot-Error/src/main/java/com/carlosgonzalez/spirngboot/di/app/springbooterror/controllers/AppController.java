package com.carlosgonzalez.spirngboot.di.app.springbooterror.controllers;

import com.carlosgonzalez.spirngboot.di.app.springbooterror.models.domain.User;
import com.carlosgonzalez.spirngboot.di.app.springbooterror.models.exceptions.UserNotFoundException;
import com.carlosgonzalez.spirngboot.di.app.springbooterror.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService service;

    @GetMapping
    public String index(){
        //int value = 100/0;
        return "Ok 200";
    }

    @GetMapping("/users/{id}")
    public User show(@PathVariable(name = "id") Long id){
        User user = service.findById(id).orElseThrow(()-> new UserNotFoundException("error el usuario no existe"));

        return user;
    }

}
