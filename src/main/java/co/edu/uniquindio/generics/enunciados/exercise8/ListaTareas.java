package co.edu.uniquindio.generics.enunciados.exercise8;

import java.util.*;

public class ListaTareas<T extends Comparable<T>> implements Iterable<T> {
    private ArrayList<T> tareas;

    public ListaTareas() {
        tareas = new ArrayList<>();
    }

    public void agregar(T tarea) {
        tareas.add(tarea);
    }

    // Iterador normal: del primero al último
    @Override
    public Iterator<T> iterator() {
        return tareas.iterator();
    }

    // Iterador inverso como clase interna
    private class IteradorInverso implements Iterator<T> {

        private int indice;

        public IteradorInverso() {
            indice = tareas.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return indice >= 0;
        }

        @Override
        public T next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            return tareas.get(indice--);
        }
    }

    public Iterator<T> iteradorInverso() {
        return new IteradorInverso();
    }

    // Obtiene los elementos entre min y max
    // usando exclusivamente el iterador inverso
    public ArrayList<T> elementosEntre(T min, T max) {

        ArrayList<T> resultado = new ArrayList<>();

        Iterator<T> iterator = iteradorInverso();

        while (iterator.hasNext()) {

            T elemento = iterator.next();

            if (elemento.compareTo(min) >= 0 &&
                    elemento.compareTo(max) <= 0) {

                resultado.add(elemento);
            }
        }

        return resultado;
    }
}
