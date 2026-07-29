import java.util.Scanner;

public class Ejercicio1Nivel1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();

            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();

            int resultado = dividendo / divisor;

            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no es posible dividir entre cero.");
        } finally {
            scanner.close();
        }
    }
}