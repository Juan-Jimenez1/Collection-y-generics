package co.edu.uniquindio.collections.exercise10;

public class Empleado {
    private int identificacion;
    private String nombre;

    public Empleado(int identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }
    @Override
    public boolean equals(Object o) {
        Empleado otro = (Empleado) o;
        return identificacion == otro.identificacion;
    }

    @Override
    public int hashCode() {
        return identificacion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "identificacion=" + identificacion +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
