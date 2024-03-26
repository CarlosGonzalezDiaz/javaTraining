package com.carlosgonzalez.spirngboot.di.app.springbooterror;

import com.carlosgonzalez.spirngboot.di.app.springbooterror.models.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class DataConfig {

    @Bean
    List<User> users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Carlos", "Gonzalez"));
        users.add(new User(2L, "Deniss", "Gonzalez"));
        users.add(new User(3L, "Yaakov", "Gonzalez"));
        users.add(new User(4L, "Milianeth", "Gonzalez"));
        return users;
    }
}
