package Ejemplos;

import java.util.ArrayList;
import java.util.List;


public class Componentes {

    private String nombre;
    private List<Componentes> hijos;

    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Componentes> getHijos() {
        return hijos;
    }

    public void setHijos(List<Componentes> hijos) {
        this.hijos = hijos;
    }

    public Componentes(String nombre) {
        this.nombre = nombre;
        this.hijos = new ArrayList<>();
    }

    public Componentes addComponente(Componentes componentes){
        this.hijos.add(componentes);
        return this;
    }

    public boolean tieneHijos(){
        return !this.hijos.isEmpty();
    }
}
