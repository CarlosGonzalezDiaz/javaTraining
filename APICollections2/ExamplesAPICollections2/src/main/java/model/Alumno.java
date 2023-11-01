package model;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Integer nota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Alumno() {
    }

    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }

    /*@Override
    public int compareTo(Alumno o) {
        if (this.nombre==null)
        {
            return 0;
        }
        return this.nombre.compareTo(o.nombre);
    }
     */
    @Override
    public int compareTo(Alumno o) {
        if (this.nota==null)
        {
            return 0;
        }
        return this.nota.compareTo(o.nota);
    }
}
