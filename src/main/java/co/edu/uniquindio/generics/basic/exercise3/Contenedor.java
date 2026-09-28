package co.edu.uniquindio.generics.basic.exercise3;

public class Contenedor<T> {
    private T elemento;

    public Contenedor(T elemento) {
        this.elemento = elemento;
    }
    public T getElemento() {
        return elemento;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "elemento=" + elemento +
                '}';
    }
}
