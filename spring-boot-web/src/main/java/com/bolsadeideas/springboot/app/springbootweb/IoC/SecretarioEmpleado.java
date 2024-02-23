package com.bolsadeideas.springboot.app.springbootweb.IoC;

public class SecretarioEmpleado implements Empleados {

    @Override
    public String getTareas() {
        return "Gestiono la agendas de los jefes";
    }
}
