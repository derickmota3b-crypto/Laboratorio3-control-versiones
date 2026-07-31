import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2Nivel1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            System.out.println("Número ingresado: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar un número entero válido.");
        } finally {
            scanner.close();
        }
    }
}