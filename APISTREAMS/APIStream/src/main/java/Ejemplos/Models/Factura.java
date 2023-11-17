package Ejemplos.Models;

public class Factura {
    private String descripcion;
    private Usuarios usuarios;

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(descripcion);

        return sb.toString();
    }
}
