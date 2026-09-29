package co.edu.uniquindio.collections.exercise11;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.agregarCancion("Telepatia");
        musica.agregarCancion("Ivonny bonita");
        musica.agregarCancion("Les");
        musica.agregarCancion("Telepatia");

        musica.mostrarFavoritos();
    }
}
