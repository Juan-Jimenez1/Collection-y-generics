package co.edu.uniquindio.collections.exercise6;


import java.util.ArrayList;
import java.util.Comparator;

public class Inventario {
    private ArrayList<Productoo> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(Productoo producto){
        productos.add(producto);
    }

    public ArrayList<Productoo> getProductos() {
        return productos;
    }
//Esta mal, falta arreglarlo ya ue se modifica mientras se recorre al mismo tiemp
//genera una excepcion, es mejor utilizar iterator
    public void eliminarAgotados(){
        for (Productoo producto : productos){
            if(producto.getStock() <= 0){
                productos.remove(producto);
            }
        }
    }

    public Productoo buscarProducto(int id){
        for (Productoo producto : productos){
            if (producto.getCodigo() == id){
                return producto;
            }
        }
        return null;
    }

    public void listarProductosPorNombre(){
        productos.sort(Comparator.comparing(Productoo::getNombre));
    }

    public void listarProductosPorPrecio(){
        productos.sort(Comparator.comparing(Productoo::getPrecio));
    }

    public void mostrarProductos(){
     for (Productoo producto: productos){
         System.out.println(producto.toString());
     }
    }
}
