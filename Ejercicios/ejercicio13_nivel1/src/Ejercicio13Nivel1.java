import java.util.Scanner;

public class Ejercicio13Nivel1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese una calificación: ");
            int calificacion = entrada.nextInt();

            if (calificacion < 0 || calificacion > 100) {
                throw new Exception("La calificación debe estar entre 0 y 100.");
            }

            System.out.println("Calificación válida: " + calificacion);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            entrada.close();
        }
    }
}