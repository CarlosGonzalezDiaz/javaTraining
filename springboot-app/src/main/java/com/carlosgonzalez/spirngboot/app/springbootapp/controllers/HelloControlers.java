package com.carlosgonzalez.spirngboot.app.springbootapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

@RestController
public class HelloControlers {

    @GetMapping("/app/foo")
    public Map<String,String> foo(){
        Map<String, String> json = new HashMap<>();
        json.put("message", "Hola Mundo Spring Boot ApiRest");
        json.put("Date", new Date().toString());
        return json;
    }
}
