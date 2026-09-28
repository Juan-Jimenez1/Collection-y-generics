package co.edu.uniquindio.generics.enunciados.excersice1;

import java.util.ArrayList;

public class App {

    // Diseñar una clase genérica InventarioCaja<T extends Comparable<T>>
    // que almacene elementos en una ArrayList<T>.
    // Implementar un método que, usando únicamente un Iterator,
    //  devuelva una nueva lista con los elementos mayores que un valor dado T umbral.
    //  Se debe prohibir el uso de for-each.
    public static void main(String[] args) {

        InventarioCaja<Integer> inventario = new InventarioCaja<>();

        inventario.agregar(10);
        inventario.agregar(25);
        inventario.agregar(5);
        inventario.agregar(40);
        inventario.agregar(15);

        ArrayList<Integer> resultado =
                inventario.mayoresQue(15);

        System.out.println("Elementos mayores que 15:");

        for (Integer elemento : resultado) {
            System.out.println(elemento);
        }
    }

}
