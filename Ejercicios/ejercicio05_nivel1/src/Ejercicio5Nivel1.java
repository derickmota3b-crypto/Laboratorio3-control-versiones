import java.util.Scanner;

public class Ejercicio5Nivel1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int numero = entrada.nextInt();

            System.out.println("Número ingresado: " + numero);

        } catch (Exception e) {
            System.out.println("Error: Debe ingresar un valor numérico.");
            
        } finally {
            System.out.println("Proceso finalizado.");
            entrada.close();
        }
    }
}