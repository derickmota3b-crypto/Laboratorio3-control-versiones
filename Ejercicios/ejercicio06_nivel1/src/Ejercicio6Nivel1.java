import java.util.Scanner;

public class Ejercicio6Nivel1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número positivo: ");
            int numero = entrada.nextInt();

            if (numero <= 0) {
                throw new Exception("El número debe ser positivo.");
            }

            System.out.println("Número válido: " + numero);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Validación finalizada.");
            entrada.close();
        }
    }
}