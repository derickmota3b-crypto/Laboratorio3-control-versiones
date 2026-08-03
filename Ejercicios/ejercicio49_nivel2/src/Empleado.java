public class Empleado {

    private String nombre;
    private double salario;

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.trim().isEmpty()) {
            throw new Exception("El nombre no puede estar vacío.");
        }

        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws Exception {
        if (salario <= 0) {
            throw new Exception("El salario debe ser mayor que cero.");
        }

        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: Q" + salario);
    }

}