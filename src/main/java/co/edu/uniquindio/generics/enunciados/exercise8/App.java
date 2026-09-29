package co.edu.uniquindio.generics.enunciados.exercise8;

import java.util.ArrayList;
import java.util.Iterator;

public class App {

    //Diseñar ListaTareas<T extends Comparable<T>> apoyada en
    // ArrayList<T>, que implemente Iterable<T>. Proveer:
    //
    //
    //Iterador “normal” (del índice 0 al final).
    //
    //
    //Iterador inverso como clase interna que recorra del último al primero.
    //
    //
    //Método que obtenga los elementos entre dos valores T min y T max usando
    // exclusivamente el iterador inverso.

    public static void main(String[] args) {

        ListaTareas<Integer> lista = new ListaTareas<>();

        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);
        lista.agregar(50);

        System.out.println("RECORRIDO NORMAL:");

        for (Integer tarea : lista) {
            System.out.println(tarea);
        }

        System.out.println("\nRECORRIDO INVERSO:");

        Iterator<Integer> inverso = lista.iteradorInverso();

        while (inverso.hasNext()) {
            System.out.println(inverso.next());
        }

        System.out.println("\nELEMENTOS ENTRE 20 Y 40:");

        ArrayList<Integer> resultado =
                lista.elementosEntre(20, 40);

        for (Integer elemento : resultado) {
            System.out.println(elemento);
        }
    }
}
