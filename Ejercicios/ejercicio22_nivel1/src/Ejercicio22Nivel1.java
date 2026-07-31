import java.util.Scanner;

public class Ejercicio22Nivel1 {

    public static void validarTexto(String texto) throws Exception {
        if (texto.length() < 4) {
            throw new Exception("El texto debe tener al menos 4 caracteres.");
        }

        System.out.println("Texto válido: " + texto);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese un texto: ");
            String texto = entrada.nextLine();

            validarTexto(texto);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            entrada.close();
        }
    }
}