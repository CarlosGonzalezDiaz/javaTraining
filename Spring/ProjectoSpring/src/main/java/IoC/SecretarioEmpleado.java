package IoC;

public class SecretarioEmpleado implements Empleados {

    private CreacionInformes creacionInformes;
    private String email;
    private String nombreEmpresa;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setCreacionInformes(CreacionInformes creacionInformes){
        this.creacionInformes = creacionInformes;
    }

    @Override
    public String getTareas() {
        return "Gestiono la agenda de los jefes";
    }

    @Override
    public String getInforme() {
        return "Informe generado por el secretario " + creacionInformes.getInforme();
    }
}
