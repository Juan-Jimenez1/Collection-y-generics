package co.edu.uniquindio.generics.advanced13;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ServicioNumerico<Integer> servicio = new ServicioNumerico<>();

        List<Integer> numeros = Arrays.asList(5, 2, 8, 1, 10);

        System.out.println("Mínimo: " + servicio.minimo(numeros));
        System.out.println("Máximo: " + servicio.maximo(numeros));
    }
}

