package com.carlosgonzalez.spirngboot.di.app.difacturas;

import com.carlosgonzalez.spirngboot.di.app.difacturas.models.Item;
import com.carlosgonzalez.spirngboot.di.app.difacturas.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource(value = "classpath:text.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice(){
        Product product1 = new Product("Camara Sony", 800d);
        Product product2 = new Product("Bicicleta", 1000d);
        List<Item> items = Arrays.asList(new Item(product1,2), new Item(product2, 4));

        return items;
    }

    @Bean("default")
    List<Item> itemsInvoiceOffice(){
        Product product1 = new Product("Escritorio", 1100d);
        Product product2 = new Product("Silla Ergonomica", 300d);
        Product product3 = new Product("Computadora", 700d);
        Product product4 = new Product("Monitor", 200d);
        List<Item> items = Arrays.asList(new Item(product1,2), new Item(product2, 4),new Item(product3,3), new Item(product4, 5));

        return items;
    }
}
