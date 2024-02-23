package com.bolsadeideas.springboot.app.springbootweb;

import com.bolsadeideas.springboot.app.springbootweb.IoC.Empleados;

public class DirectorEmpleado implements Empleados {
    @Override
    public String getTareas() {
        return "Gestionar la plantilla de la empresa";
    }
}
