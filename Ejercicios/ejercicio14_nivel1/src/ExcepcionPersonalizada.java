import java.util.Scanner;

public class ExcepcionPersonalizada {

    public static void validarEdad(int edad) throws EdadException {
        if (edad < 0) {
            throw new EdadException("La edad no puede ser negativa.");
        }

        System.out.println("Edad válida: " + edad);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = entrada.nextInt();

            validarEdad(edad);

        } catch (EdadException e) {
            System.out.println("Error: " + e.getMessage());
        }

        entrada.close();
    }
}