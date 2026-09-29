package co.edu.uniquindio.generics.exercise6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class PilaGenerica<T>{
    private LinkedList<T> pila;

    public PilaGenerica() {
        pila = new LinkedList<>();
    }

    public void push(T elemento) {
        pila.push(elemento);
    }

    public List<T> extraerSi(Predicate<T> p, int max) {

        List<T> resultado = new ArrayList<>();
        Iterator<T> iterator = pila.iterator();

        while (iterator.hasNext() && resultado.size() < max) {

            T elemento = iterator.next();

            if (p.test(elemento)) {
                resultado.add(elemento);
            }
        }

        return resultado;
    }
}
