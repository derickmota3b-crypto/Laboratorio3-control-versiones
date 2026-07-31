import java.util.Scanner;

public class Ejercicio7Nivel1 {

    public static void validarNumero(int numero) throws Exception {
        if (numero < 0) {
            throw new Exception("El número no puede ser negativo.");
        }

        System.out.println("Número válido: " + numero);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int numero = entrada.nextInt();

            validarNumero(numero);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        entrada.close();
    }
}