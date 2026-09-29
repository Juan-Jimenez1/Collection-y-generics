package co.edu.uniquindio.collections.exercise5;

public class Main {
    public static void main(String[] args) {
        ProductosMap productos = new ProductosMap();

        productos.agregarProductosHashMap();
        productos.agregarProductosLinkedHashMap();
        productos.agregarProductosTreeMap();

        productos.mostrarMapas();
    }
    //HashMap: No garantiza el orden
    //LinkedHashMap:Conserva el orden de ingreso
    //TreeMap: Mantiene las claves ordenadas
}
