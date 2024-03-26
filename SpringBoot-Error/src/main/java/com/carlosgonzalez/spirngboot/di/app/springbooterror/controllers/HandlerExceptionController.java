package com.carlosgonzalez.spirngboot.di.app.springbooterror.controllers;

import com.carlosgonzalez.spirngboot.di.app.springbooterror.models.Error;
import com.carlosgonzalez.spirngboot.di.app.springbooterror.models.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@ControllerAdvice
public class HandlerExceptionController {

    /*@ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<?> divisionbyzero(Exception exception){
        return ResponseEntity.internalServerError().body("Error en division");
    }
     */

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Error> divisionbyzero(Exception exception){
        Error error = new Error();
        error.setDate(new Date());
        error.setError("Error division por cero");
        error.setMessage(exception.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

        //return ResponseEntity.internalServerError().body(error);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Error> notFoundException(NoHandlerFoundException ex){
        Error error = new Error();
        error.setDate(new Date());
        error.setError("API Rest no encontrado");
        error.setMessage(ex.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());

        return ResponseEntity.status(404).body(error);
    }

    /*@ExceptionHandler(NumberFormatException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> numberFormatException(Exception ex){
        Map<String,Object> error = new HashMap<>();
        error.put("date", new Date());
        error.put("error", "No tiene formato de digito");
        error.put("message", ex.getMessage());
        error.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());

        return error;
    }*/

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String,String> userNotFound(Exception ex){
        Map<String, String> error = new HashMap<>();
        error.put("error", "Usuario no encontrado");
    return error;
    }

}
