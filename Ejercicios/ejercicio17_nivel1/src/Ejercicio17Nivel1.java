import java.util.Scanner;

public class Ejercicio17Nivel1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese una palabra: ");
            String palabra = entrada.nextLine();

            System.out.print("Ingrese la posición del carácter: ");
            int posicion = entrada.nextInt();

            char caracter = palabra.charAt(posicion);

            System.out.println("El carácter es: " + caracter);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: La posición ingresada está fuera del rango de la palabra.");

        } finally {
            entrada.close();
        }
    }
}