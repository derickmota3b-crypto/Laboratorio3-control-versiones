import java.util.Scanner;

public class Ejercicio20Nivel1 {

    public static void validarCodigo(int codigo) throws Exception {
        if (codigo != 1234) {
            throw new Exception("Código de acceso incorrecto.");
        }

        System.out.println("Acceso permitido.");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese el código de acceso: ");
            int codigo = entrada.nextInt();

            validarCodigo(codigo);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            entrada.close();
        }
    }
}