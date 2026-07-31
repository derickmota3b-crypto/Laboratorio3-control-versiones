public class App {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();

        try {
            cuenta.setSaldo(1000);
            cuenta.depositar(500);
            cuenta.retirar(1600);

            System.out.println("Saldo: Q" + cuenta.getSaldo());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}