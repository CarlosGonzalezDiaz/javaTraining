package Patrones.FactoryAbstract;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProducto {

    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void addIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public PizzaProducto(){
        this.ingredientes = new ArrayList<>();
    }

    public void preparar(){
        System.out.println("preparando " + nombre);
        System.out.println("seleccionando la masa " + masa);
        System.out.println("agregando la salsa " + salsa);
        System.out.println("agregando los ingredientes");
        this.ingredientes.forEach(System.out::println);
    }

    public void empaquetar(){
        System.out.println("empaquetando la pizza");
    }

    public abstract void cocinar();
    public abstract void cortar();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PizzaProducto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", masa='").append(masa).append('\'');
        sb.append(", salsa='").append(salsa).append('\'');
        sb.append(", ingredientes=").append(ingredientes);
        sb.append('}');
        return sb.toString();
    }
}
