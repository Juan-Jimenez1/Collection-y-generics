package co.edu.uniquindio.collections.exercise1;

public class App {

//Crear la lista de productos en una clase empresa utilizando treeset,
// se debe realizar un método que busque un producto por su código.

    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        empresa.addProducto(
                new Producto(103, "Arroz", 5000)
        );

        empresa.addProducto(
                new Producto(205, "Leche", 4000)
        );

        empresa.addProducto(
                new Producto(101, "Pan", 3000)
        );

        Producto encontrado = empresa.buscarProductoPorCodigo(205);

        System.out.println(encontrado);
    }
}

