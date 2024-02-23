package IoC;

public class JefeEmpleado implements Empleados{
    @Override
    public String getTareas(){
        return "Gestiono las cuestiones relativas a los empleados";
    }

    @Override
    public String getInforme() {
        return null;
    }
}
