package co.edu.uniquindio.collections.exercise17;

import java.time.LocalDate;

public class App {

//En una agenda de eventos, es fundamental organizar las actividades según su fecha de realización.
// Para cumplir con este requerimiento, se usará un TreeMap, que almacenará los eventos
// con sus respectivas fechas como clave, garantizando que siempre se mantengan ordenados cronológicamente
// y permitiendo acceder de manera eficiente al evento más próximo.
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.agregarEvento(
                LocalDate.of(2026, 9, 30),
                new Evento(
                        "Parcial",
                        "Parcial de estructuras de datos"
                )
        );

        agenda.agregarEvento(
                LocalDate.of(2026, 10, 5),
                new Evento(
                        "Entrega",
                        "Entrega del proyecto"
                )
        );

        agenda.agregarEvento(
                LocalDate.of(2026, 11, 20),
                new Evento(
                        "Exposición",
                        "Exposición del proyecto final"
                )
        );

        System.out.println("EVENTOS ORDENADOS:");
        agenda.mostrarEventos();

        System.out.println("\nEVENTO DEL 5 DE OCTUBRE:");

        System.out.println(
                agenda.obtenerEvento(
                        LocalDate.of(2026, 10, 5)
                )
        );

        System.out.println("\nEVENTO MÁS PRÓXIMO:");

        System.out.println(
                agenda.obtenerEventoMasProximo()
        );
    }


}
