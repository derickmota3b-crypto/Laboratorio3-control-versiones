import java.util.Scanner;

public class Ejercicio19Nivel1 {

    public static void validarNumero(int numero) throws Exception {
        if (numero > 100) {
            throw new Exception("El número no puede ser mayor a 100.");
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
        } finally {
            entrada.close();
        }
    }
}