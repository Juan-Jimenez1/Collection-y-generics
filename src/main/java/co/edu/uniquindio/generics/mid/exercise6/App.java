package co.edu.uniquindio.generics.mid.exercise6;

public class App {

    // Crear una clase genérica que almacene un número
    // y tenga un método doble() que devuelva el doble de su valor.
    public static void main(String[] args) {

        CajaNumerica<Integer> entero = new CajaNumerica<>(10);
        CajaNumerica<Double> decimal = new CajaNumerica<>(5.5);

        System.out.println(entero.obtenerDoble());
        System.out.println(decimal.obtenerDoble());
    }
}
