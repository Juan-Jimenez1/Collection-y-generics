package co.edu.uniquindio.collections.exercise6;

public class App {


//En una tienda se necesita una aplicación para gestionar el inventario de
// productos(codigo, nombre, precio), permitiendo agregar nuevos artículos,
// eliminar los que están agotados, buscar productos específicos y listar
// todo el inventario en orden alfabético y por orden de precio.
//  Para ello, se utilizará una ArrayList, que ofrece acceso rápido a los elementos y
//  permite su manipulación de manera eficiente.
    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        inventario.addProducto(
                new Productoo(101, "Arroz", 5000, 10)
        );

        inventario.addProducto(
                new Productoo(102, "Leche", 4000, 0)
        );

        inventario.addProducto(
                new Productoo(103, "Pan", 3000, 5)
        );

        inventario.addProducto(
                new Productoo(104, "Zanahoria", 2500, 8)
        );

        System.out.println("INVENTARIO:");
        inventario.mostrarProductos();

        System.out.println("\nBUSCAR PRODUCTO:");
        System.out.println(inventario.buscarProducto(103));

        System.out.println("\nELIMINANDO AGOTADOS:");
        inventario.eliminarAgotados();
        inventario.mostrarProductos();

        System.out.println("\nORDEN ALFABÉTICO:");
        inventario.listarProductosPorNombre();
        inventario.mostrarProductos();

        System.out.println("\nORDEN POR PRECIO:");
        inventario.listarProductosPorPrecio();
        inventario.mostrarProductos();
    }
}
