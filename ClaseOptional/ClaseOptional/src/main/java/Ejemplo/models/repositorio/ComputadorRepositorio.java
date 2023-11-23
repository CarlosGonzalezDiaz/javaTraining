package Ejemplo.models.repositorio;

import Ejemplo.models.Computador;
import Ejemplo.models.Fabricante;
import Ejemplo.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador>{

    private List<Computador> dataSource;

    public ComputadorRepositorio() {
        dataSource=new ArrayList<>();
        Procesador procesador = new Procesador("I9-9800H", new Fabricante("Intel"));
        Computador asus = (new Computador("Asus ROG","Strix G512"));
        asus.setProcesador(procesador);
        dataSource.add(asus);
        dataSource.add(new Computador("MackbookPro","MVVK2CI"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        /*for (Computador computador: dataSource)
        {
            if (computador.getNombre().equalsIgnoreCase(nombre))
            {
                return Optional.ofNullable(computador);
            }
        }
        return Optional.empty();
    }
    */

        return dataSource.stream().filter(computador -> computador.getNombre().toLowerCase().contains(nombre.toLowerCase())).findFirst();
    }
}
