import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio25Nivel1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("===== MENÚ =====");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Hola! Bienvenido.");
                    break;

                case 2:
                    System.out.println("La fecha de hoy es: 30/07/2026");
                    break;

                case 3:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    throw new Exception("La opción seleccionada no es válida.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            entrada.close();
        }
    }
}