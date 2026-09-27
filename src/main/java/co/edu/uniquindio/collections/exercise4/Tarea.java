package co.edu.uniquindio.collections.exercise4;


public class Tarea implements Comparable<Tarea>{
    private String nombre;
    private Prioridad prioridad;

    public Tarea(String nombre, Prioridad prioridad){
        this.nombre=nombre;
        this.prioridad=prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tarea o) {
        return this.prioridad.compareTo(o.prioridad);
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
}
