package co.edu.uniquindio.generics.advanced.exercise14;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenador<T extends Comparable<T>> {

    public void ordenar(ArrayList<T> lista) {
        Collections.sort(lista);
    }
}
