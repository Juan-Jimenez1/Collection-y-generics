package co.edu.uniquindio.generics.enunciados.excersice1;

import java.util.ArrayList;
import java.util.Iterator;

public class InventarioCaja<T extends Comparable<T>> {

    private ArrayList<T> elementos;

    public InventarioCaja() {
        elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public ArrayList<T> mayoresQue(T umbral) {

        ArrayList<T> resultado = new ArrayList<>();

        Iterator<T> iterator = elementos.iterator();

        while (iterator.hasNext()) {

            T elemento = iterator.next();

            if (elemento.compareTo(umbral) > 0) {
                resultado.add(elemento);
            }
        }

        return resultado;
    }
}