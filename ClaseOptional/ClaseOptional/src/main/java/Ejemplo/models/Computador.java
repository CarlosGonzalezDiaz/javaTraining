package Ejemplo.models;

public class Computador {
    private String nombre;
    private String modelo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Computador() {
    }

    public Computador(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
