package com.bolsadeideas.springboot.app.springbootweb;

import com.bolsadeideas.springboot.app.springbootweb.IoC.Empleados;
import com.bolsadeideas.springboot.app.springbootweb.IoC.JefeEmpleado;
import com.bolsadeideas.springboot.app.springbootweb.IoC.SecretarioEmpleado;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
        /*
        //Creacion de objetos de tipo Empleado
        Empleados Empleado = new DirectorEmpleado();
        System.out.println(Empleado.getTareas());
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("")

    }

}
