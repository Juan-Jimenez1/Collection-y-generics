package co.edu.uniquindio.generics.basic1;

public class Main {
    public static void main(String[] args) {
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Hola Generics");

        System.out.println(cajaTexto.obtener());

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(25);

        System.out.println(cajaNumero.obtener());
}
}
