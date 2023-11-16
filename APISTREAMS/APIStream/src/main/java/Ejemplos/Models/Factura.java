package Ejemplos.Models;

public class Factura {
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Factura(String descripcion)
    {
        this.descripcion=descripcion;
    }
}
