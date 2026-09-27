package co.edu.uniquindio.collections.exercise1;

import java.util.TreeSet;

public class Empresa {

    private TreeSet<Producto> productos;

    public Empresa() {
        productos = new TreeSet<>();
    }

    public void addProducto(Producto producto){
        productos.add(producto);
    }

    public Producto buscarProductoPorCodigo(int codigo){
        for(Producto producto: productos){
            if(producto.getCodigo() == codigo ){
                return producto;
            }
        }
        return null;
    }
}
