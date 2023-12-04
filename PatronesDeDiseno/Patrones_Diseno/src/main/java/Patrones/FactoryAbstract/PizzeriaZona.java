package Patrones.FactoryAbstract;

public abstract class PizzeriaZona {
    abstract PizzaProducto crearPizza(String tipo);

    public PizzaProducto ordenarPizza(String tipo){
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("Fabricando la pizza " + pizza.getNombre()+ "-------");
        pizza.
    }

}
