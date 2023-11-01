package Modelo;

public class Alumno {
        private String nombre;
        private int nota;
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public int getNota() {
            return nota;
        }
    
        public void setNota(int nota) {
            this.nota = nota;
        }
    
        public Alumno() {
        }
    
        public Alumno(String nombre, int nota) {
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
}
