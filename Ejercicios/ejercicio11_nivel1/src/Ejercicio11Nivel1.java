import java.util.Scanner;

public class Ejercicio11Nivel1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 40, 50};

        try {
            System.out.print("Ingrese un índice (0-4): ");
            int indice = entrada.nextInt();

            System.out.println("Valor: " + numeros[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El índice está fuera del rango del arreglo.");
        }

        entrada.close();
    }
}