import java.util.Scanner;

public class Ejercicio8Nivel1 {

    public static void dividir(int numero1, int numero2) throws Exception {
        if (numero2 == 0) {
            throw new Exception("No se puede dividir entre cero.");
        }

        int resultado = numero1 / numero2;
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            int numero1 = entrada.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int numero2 = entrada.nextInt();

            dividir(numero1, numero2);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        entrada.close();
    }
}