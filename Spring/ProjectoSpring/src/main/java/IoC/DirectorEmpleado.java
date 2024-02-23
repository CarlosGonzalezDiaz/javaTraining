package IoC;

public class DirectorEmpleado implements Empleados {
    //Creacion de campo tipo informe
    private CreacionInformes informes;


    //Aqui se produce la inyeccion de dependencia DI
    public DirectorEmpleado(CreacionInformes creacionInformes){
        this.informes = creacionInformes;
    }

    @Override
    public String getTareas() {
        return "Gestionar la plantilla de la empresa";
    }

    @Override
    public String getInforme() {
        return "Informe creado por el Director " + informes.getInforme();
    }
}
