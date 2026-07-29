import java.util.Scanner;

public class LanzarExcepcionPersonalizada {

    public static void validarNumero(int numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("El número no puede ser negativo.");
        }

        System.out.println("Número válido: " + numero);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int numero = entrada.nextInt();

            validarNumero(numero);

        } catch (NumeroNegativoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        entrada.close();
    }
}