package co.edu.uniquindio.generics.mid8;

public class Main {
    public static void main(String[] args) {
         Comparador<Integer> comparador = new Comparador<>();

        System.out.println(comparador.mayor(17, 20));
        System.out.println(comparador.mayor(23, 10));
    }
}
