import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Cuadrado(5));
        figuras.add(new Circulo(3));

        System.out.println("Áreas de las figuras:");

        for (Figura figura : figuras) {
            System.out.println(figura.area());
        }

        Vehiculo carro = new Carro();
        Vehiculo moto = new Moto();

        carro.conducir();
        moto.conducir();

    }

}