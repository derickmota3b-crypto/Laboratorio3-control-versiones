import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio23Nivel1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            int numero = entrada.nextInt();

            System.out.println("Número ingresado: " + numero);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero.");

        } finally {
            entrada.close();
        }
    }
}