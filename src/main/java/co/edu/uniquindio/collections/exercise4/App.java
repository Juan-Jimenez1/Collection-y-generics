package co.edu.uniquindio.collections.exercise4;

import co.edu.uniquindio.generics.Main;

import java.util.Comparator;
import java.util.PriorityQueue;

//Cree una cola (Queue) que almacene objetos de tipo "Tarea" que tengan
// una prioridad asociada. Implemente la cola usando un PriorityQueue y defina la prioridad de
// cada tarea según su importancia.
public class App {

    public static void main(String[] args) {

        PriorityQueue<Tarea> cola = new PriorityQueue<>(Comparator.comparing(Tarea::getPrioridad));

        cola.offer(new Tarea("Hacer parcial", Prioridad.BAJA));
        cola.offer(new Tarea("Estudiar Java", Prioridad.BAJA));
        cola.offer(new Tarea("Hacer ejercicio", Prioridad.MEDIA));
        cola.offer(new Tarea("Ver película", Prioridad.ALTA));

        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}
