package com.carlosgonzalez.spirngboot.app.introduccion.Controllers;


import com.carlosgonzalez.spirngboot.app.introduccion.models.User;
import com.carlosgonzalez.spirngboot.app.introduccion.models.dto.UserDto;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class UserRestController {


    @GetMapping("/details")
    /*public Map<String,Object> details(){
        Map<String, Object> jsonBody = new HashMap<>();
        jsonBody.put("title","Hola Mundo Spring Boot");
        jsonBody.put("user", user);
         */
    public UserDto details(){
        User user = new User("Carlos", "Gonzalez");

        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");

        return userDto;
    }
    @GetMapping("/list")
    public List<User> list(){
        User user1 = new User("Carlos", "Gonzalez");
        User user2 = new User("Yaakov", "Gonzalez-Rodriguez");
        User user3 = new User("Deniss", "Rodriguez");
        User user4 = new User("Milianeth", "Gonzalez-Rodriguez");

        List<User> users = Arrays.asList(user1, user2, user3, user4);

        /*List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        */

        return users;
    }

}
