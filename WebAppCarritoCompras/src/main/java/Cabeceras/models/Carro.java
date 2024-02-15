package Cabeceras.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Carro {
    private  List<ItemCarro> itemCarros;

    public Carro(){
        this.itemCarros= new ArrayList<>();
    }

    public void addItemCarro(ItemCarro itemsCarro) {
        if (itemCarros.contains(itemsCarro)){
            Optional<ItemCarro> optionalItemCarro = itemCarros.stream().filter(itemCarro -> itemCarro.equals(itemCarro)).findAny();
            if (optionalItemCarro.isPresent()){
                ItemCarro i = optionalItemCarro.get();
                i.setCantidad(i.getCantidad()+1);
            }
        }
        else {
            this.itemCarros.add(itemsCarro);
        }
    }

    public void deleteItemCarro(ItemCarro deleteItemsCarro) {
        if (itemCarros.contains(deleteItemsCarro)){
            Producto producto = null;
            Optional<ItemCarro> optionalItemCarro = itemCarros.stream().filter(itemCarro -> itemCarro.equals(itemCarro)).findAny();
            if (optionalItemCarro.isPresent()){
                ItemCarro i = optionalItemCarro.get();
                i.setCantidad(i.getCantidad()-1);
                if (i.getCantidad()<=0)
                {
                    producto.setId(null);
                    producto.setNombre(null);
                    producto.setPrecio(null);
                    i.setCantidad(0);
                    i.setProducto(null);
                }
            }
        }
        else {
            this.itemCarros.add(deleteItemsCarro);
        }
    }

    public List<ItemCarro> getItemCarros() {
        return itemCarros;
    }

    public int getTtotal(){
        return itemCarros.stream().mapToInt(value -> value.getTotal()).sum();
    }
}
