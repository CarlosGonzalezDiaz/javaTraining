package Ejemplos.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuarios {
    private String nombre;
    private String apellido;
    private Integer id;

    private List<Factura> facturas;
    public static int ultimoId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void addFacturas(Factura facturas) {

        this.facturas.add(facturas);
        facturas.setUsuarios(this);
    }

    public Usuarios(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++ultimoId;
        this.facturas = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuarios usuarios = (Usuarios) o;
        return Objects.equals(nombre, usuarios.nombre) && Objects.equals(apellido, usuarios.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
