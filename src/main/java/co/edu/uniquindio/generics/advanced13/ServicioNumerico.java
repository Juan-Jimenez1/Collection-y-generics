package co.edu.uniquindio.generics.advanced13;
import java.util.List;

public class ServicioNumerico<T extends Number & Comparable<T>> implements Servicio<T> {

    @Override
    public T minimo(List<T> lista) {
        T minimo = lista.get(0);

        for (T elemento : lista) {
            if (elemento.compareTo(minimo) < 0) {
                minimo = elemento;
            }
        }

        return minimo;
    }

    @Override
    public T maximo(List<T> lista) {
        T maximo = lista.get(0);

        for (T elemento : lista) {
            if (elemento.compareTo(maximo) > 0) {
                maximo = elemento;
            }
        }

        return maximo;
    }

}
