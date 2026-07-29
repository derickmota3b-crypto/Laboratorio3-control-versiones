import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio12Nivel1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            int numero1 = entrada.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int numero2 = entrada.nextInt();

            int resultado = numero1 / numero2;

            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar únicamente números.");

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");

        } finally {
            System.out.println("Proceso finalizado.");
            entrada.close();
        }
    }
}