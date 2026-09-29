package co.edu.uniquindio.collections.exercise11;
import java.util.LinkedHashSet;

public class Musica {
    private LinkedHashSet<String> favoritos;

    public Musica() {
        favoritos = new LinkedHashSet<>();
    }

    public void agregarCancion(String cancion) {
        favoritos.add(cancion);
    }

    public void mostrarFavoritos() {
        System.out.println(favoritos);
    }
}
