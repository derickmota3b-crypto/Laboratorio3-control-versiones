import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio24Nivel1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.print("Ingrese un número entero: ");
                numero = entrada.nextInt();
                continuar = false;

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                entrada.nextLine();
            }
        }

        System.out.println("Número ingresado: " + numero);

        entrada.close();
    }
}