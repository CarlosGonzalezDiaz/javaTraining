package com.carlosgonzalez.spirngboot.di.app.dependencyinjection;

import com.carlosgonzalez.spirngboot.di.app.dependencyinjection.repositories.IProductRepository;
import com.carlosgonzalez.spirngboot.di.app.dependencyinjection.repositories.ProductRepositoryJson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:valor.properties")
public class AppConfig {

    @Primary
    @Bean
    IProductRepository productRepositoryJson(){
        return new ProductRepositoryJson();
    }

}
