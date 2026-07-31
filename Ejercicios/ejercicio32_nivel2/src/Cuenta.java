public class Cuenta {

    private double saldo;

    public Cuenta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) throws Exception {
        if (saldo < 0) {
            throw new Exception("El saldo no puede ser negativo.");
        }

        this.saldo = saldo;
    }

    public void depositar(double monto) throws Exception {
        if (monto <= 0) {
            throw new Exception("El monto a depositar debe ser mayor que cero.");
        }

        saldo += monto;
    }

}