package co.edu.uniquindio.generics.basic.exercise3;

public class App {

    //Definir una interfaz con métodos agregar(T item)
    // y obtener(int indice). Implementarla con una clase ListaContenedor<T>.
    public static void main(String[] args) {

        Contenedor<String> contenedorTexto =
                new Contenedor<>("Hola");

        Contenedor<Integer> contenedorNumero =
                new Contenedor<>(25);

        System.out.println(contenedorTexto.getElemento());
        System.out.println(contenedorNumero.getElemento());
    }
}
