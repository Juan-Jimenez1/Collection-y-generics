package co.edu.uniquindio.generics.advanced13;
import java.util.List;

public interface Servicio <T extends Number & Comparable<T>> {
    T minimo(List<T> lista);
    T maximo(List<T> lista);


}
