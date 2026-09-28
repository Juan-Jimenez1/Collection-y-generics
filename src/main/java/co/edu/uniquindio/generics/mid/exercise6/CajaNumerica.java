package co.edu.uniquindio.generics.mid.exercise6;

public class CajaNumerica<T extends Number> {

    private T valor;

    public CajaNumerica(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public double obtenerDoble() {
        return valor.doubleValue() * 2;
    }

    @Override
    public String toString() {
        return "CajaNumerica{" +
                "valor=" + valor +
                '}';
    }
}
