import java.util.Scanner;

public class Ejercicio18Nivel1 {

    public static int dividir(int numero1, int numero2) throws Exception {
        if (numero2 == 0) {
            throw new Exception("No se puede dividir entre cero.");
        }

        return numero1 / numero2;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            int numero1 = entrada.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int numero2 = entrada.nextInt();

            int resultado = dividir(numero1, numero2);

            System.out.println("Resultado: " + resultado);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            entrada.close();
        }
    }
}