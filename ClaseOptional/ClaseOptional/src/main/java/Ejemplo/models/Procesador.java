package Ejemplo.models;

public class Procesador {
    private String nombre;
    private Fabricante fabricante;

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Procesador(String nombre, Fabricante fabricante) {
        this.nombre = nombre;
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Procesador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", fabricante=").append(fabricante);
        sb.append('}');
        return sb.toString();
    }
}
