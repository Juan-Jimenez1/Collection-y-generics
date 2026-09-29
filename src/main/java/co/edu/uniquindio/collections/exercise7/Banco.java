package co.edu.uniquindio.collections.exercise7;
import java.util.LinkedList;

public class Banco {
    private LinkedList<String> clientes;

    public Banco() {
        clientes = new LinkedList<>();
    }

    public void agregarCliente(String cliente) {
        clientes.add(cliente);
    }

    public String atenderCliente() {
        return clientes.removeFirst();
    }
    public void agregarClienteUrgente(String cliente) {
        clientes.addFirst(cliente);
    }
}
