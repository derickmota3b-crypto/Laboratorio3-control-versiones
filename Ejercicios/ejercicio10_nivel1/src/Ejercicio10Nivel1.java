import java.util.Scanner;

public class Ejercicio10Nivel1 {

    public static void validarContrasena(String contrasena) throws Exception {
        if (contrasena.length() < 8) {
            throw new Exception("La contraseña debe tener mínimo 8 caracteres.");
        }

        System.out.println("Contraseña válida.");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese una contraseña: ");
            String contrasena = entrada.nextLine();

            validarContrasena(contrasena);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        entrada.close();
    }
}