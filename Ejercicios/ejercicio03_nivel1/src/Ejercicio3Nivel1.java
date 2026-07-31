import java.util.Scanner;

public class Ejercicio3Nivel1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        String entrada = scanner.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto ingresado no es un número válido.");
        } finally {
            scanner.close();
        }
    }
}