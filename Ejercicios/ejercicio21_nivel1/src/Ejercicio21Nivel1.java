import java.util.Scanner;

public class Ejercicio21Nivel1 {

    public static void validarEmail(String email) throws Exception {
        if (!email.contains("@") || !email.contains(".")) {
            throw new Exception("El correo electrónico no es válido.");
        }

        System.out.println("Correo electrónico válido.");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese un correo electrónico: ");
            String email = entrada.nextLine();

            validarEmail(email);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            entrada.close();
        }
    }
}