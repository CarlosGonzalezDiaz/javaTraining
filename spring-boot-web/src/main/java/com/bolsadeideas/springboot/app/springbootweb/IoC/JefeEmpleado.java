package com.bolsadeideas.springboot.app.springbootweb.IoC;

public class JefeEmpleado implements Empleados{

    @Override
    public String getTareas(){
        return "Gestiono las cuestiones relativas a mis empleados de Seccion";
    }

}
