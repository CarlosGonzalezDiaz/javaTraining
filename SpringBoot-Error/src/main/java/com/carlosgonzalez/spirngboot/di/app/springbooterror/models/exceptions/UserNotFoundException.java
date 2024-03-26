package com.carlosgonzalez.spirngboot.di.app.springbooterror.models.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message)
    {
        super(message);
    }
}
