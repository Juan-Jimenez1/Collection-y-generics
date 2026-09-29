package co.edu.uniquindio.collections.exercise10;

public class Main {
    public static void main(String[] args) {
        Banco banco= new Banco();

        banco.agregarEmpleado(new Empleado(101, "Maria"));
        banco.agregarEmpleado(new Empleado(102, "Lucia"));
        banco.agregarEmpleado(new Empleado(101, "Violeta"));

        banco.mostrarEmpleados();
    }

}
