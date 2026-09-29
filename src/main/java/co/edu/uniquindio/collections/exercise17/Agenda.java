package co.edu.uniquindio.collections.exercise17;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class Agenda {
    private TreeMap<LocalDate, Evento> eventos;

    public Agenda() {
        eventos = new TreeMap<>();
    }

    public void agregarEvento(LocalDate fecha, Evento evento) {
        eventos.put(fecha, evento);
    }

    public Evento obtenerEvento(LocalDate fecha) {
        return eventos.get(fecha);
    }

    public Evento obtenerEventoMasProximo() {

        Map.Entry<LocalDate, Evento> entrada =
                eventos.ceilingEntry(LocalDate.now());

        if (entrada != null) {
            return entrada.getValue();
        }

        return null;
    }

    public void mostrarEventos() {

        for (Map.Entry<LocalDate, Evento> entrada : eventos.entrySet()) {
            System.out.println(
                    entrada.getKey() + " → " + entrada.getValue()
            );
        }
    }
}
