package com.carlosgonzalez.spirngboot.app.introduccion.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/", "", "/home"})
    public String home(){

        return "forward:/listas";
    }
}
