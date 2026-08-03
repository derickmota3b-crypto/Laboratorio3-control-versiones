import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Animal());

        for (Animal animal : animales) {
            animal.sonido();
        }

    }

}