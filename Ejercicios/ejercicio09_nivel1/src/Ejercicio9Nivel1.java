import java.util.Scanner;

public class Ejercicio9Nivel1 {

    public static void validarEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("La edad no puede ser negativa.");
        }

        System.out.println("Edad válida: " + edad);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = entrada.nextInt();

            validarEdad(edad);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        entrada.close();
    }
}