package co.edu.uniquindio.generics.exercise6;

public class Main {
    public static void main(String[] args) {

        PilaGenerica<Integer> pila = new PilaGenerica<>();

        pila.push(10);
        pila.push(5);
        pila.push(8);
        pila.push(3);
        pila.push(12);

        System.out.println(pila.extraerSi(numero -> numero > 5, 3));
    }
}
