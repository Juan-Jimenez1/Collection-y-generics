package co.edu.uniquindio.collections.exercise2;
import java.util.Stack;

public class PilaTipos {
    private Stack<Object> pila;

    public PilaTipos(){
        pila = new Stack<>();
    }
    public void push(Object elemento) {

        if (pila.isEmpty()) {
            pila.push(elemento);
        } else if (pila.peek().getClass().equals(elemento.getClass())) {
            pila.push(elemento);
        }
    }
    public Object pop() {
        return pila.pop();
    }

    public void mostrarPila() {
        System.out.println(pila);
    }
}