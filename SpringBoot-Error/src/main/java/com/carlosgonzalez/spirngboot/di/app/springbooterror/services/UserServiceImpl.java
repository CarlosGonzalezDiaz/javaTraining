package com.carlosgonzalez.spirngboot.di.app.springbooterror.services;

import com.carlosgonzalez.spirngboot.di.app.springbooterror.models.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private List<User> users;

    @Override
    public Optional<User> findById(Long id) {
        //Optional<User> user = users.stream().filter(usr -> usr.getId().equals(id)).findFirst();
        return users.stream().filter(usr -> usr.getId().equals(id)).findFirst();
    }

    @Override
    public List<User> finfAll() {

        return users;
    }
}
