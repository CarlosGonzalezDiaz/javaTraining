package com.carlosgonzalez.spirngboot.di.app.springbooterror.services;

import com.carlosgonzalez.spirngboot.di.app.springbooterror.models.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findById(Long id);

    List<User> finfAll();
}
