package co.edu.uniquindio.collections.exercise7;

public class Main {
    public static void main(String[] args) {

        Banco banco= new Banco();

        banco.agregarCliente("Maria");
        banco.agregarCliente("Juan");
        banco.agregarCliente("Tun Tun");

        banco.agregarClienteUrgente("Jhan");

        System.out.println("Cliente atendido: " + banco.atenderCliente());
    }
}
