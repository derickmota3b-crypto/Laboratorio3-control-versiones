import java.util.Scanner;

public class Ejercicio4_nivel1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int numero = entrada.nextInt();

            System.out.println("El número ingresado es: " + numero);

        } catch (Exception e) {
            System.out.println("Error: Debe ingresar únicamente valores numéricos.");
        }

        entrada.close();
    }
}