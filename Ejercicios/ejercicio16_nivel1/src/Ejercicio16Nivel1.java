import java.util.Scanner;

public class Ejercicio16Nivel1 {

    public static void validarTexto(String texto) throws Exception {
        if (texto.trim().isEmpty()) {
            throw new Exception("El texto no puede estar vacío.");
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
        }

        entrada.close();
    }
}