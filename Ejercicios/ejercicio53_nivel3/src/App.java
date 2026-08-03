public class App {

    public static void main(String[] args) {

        Figura cuadrado = new Cuadrado(5);
        Figura circulo = new Circulo(3);

        System.out.println("Área del cuadrado: " + cuadrado.area());
        System.out.println("Área del círculo: " + circulo.area());

    }

}