package co.edu.uniquindio.collections.exercise10;
import java.util.HashSet;

public class Banco {
    private HashSet<Empleado> empleados;

    public Banco() {
        empleados = new HashSet<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println(empleados);
    }
}
