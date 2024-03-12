package com.carlosgonzalez.spirngboot.app.introduccion.Controllers;

import com.carlosgonzalez.spirngboot.app.introduccion.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Carlos", "Gonzalez");
        model.addAttribute("title","Hola Mundo Spring Boot");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/listas")
    public String list(ModelMap modelMap){
        modelMap.addAttribute("title", "Listado de usuarios");
        modelMap.addAttribute("header","Lista de usuarios");

        return "list";
    }


@ModelAttribute("users")
    public List<User> usersModel(){
         List<User> users = Arrays.asList(
            new User("Carlos","Gonzalez"),
            new User("Deniss", "Rodriguez", "drodriguez@mail.com"));
         return users;
        }

}
