package com.carlosgonzalez.spirngboot.app.introduccion.Controllers;

import com.carlosgonzalez.spirngboot.app.introduccion.models.User;
import com.carlosgonzalez.spirngboot.app.introduccion.models.dto.ParamDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {
    @Value("${config.username}")
    private String username;
    @Value("${config.code}")
    private Integer code;
    @Value("${config.message}")
    private String message;

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable() String message){
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);
        return paramDto;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPath(@PathVariable String product, @PathVariable Long id){
        Map <String,Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user){
        return user;
    }

    @GetMapping("/values")
    public Map<String,Object> values(){
        Map<String,Object> json = new HashMap<>();
        json.put("username", username);
        json.put("code", code);
        json.put("message", message);
        return json;
    }
}
