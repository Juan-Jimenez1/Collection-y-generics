package co.edu.uniquindio.generics.advanced.exercise14;

import java.util.ArrayList;

public class App {
    // Implementar un método ordenar(List<T> lista) que ordene una lista usando el método compareTo.

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);

        Ordenador<Integer> ordenador = new Ordenador<>();

        ordenador.ordenar(numeros);

        System.out.println(numeros);
    }
}
