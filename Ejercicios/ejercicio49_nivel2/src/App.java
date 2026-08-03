public class App {

    public static void main(String[] args) {

        Empleado empleado = new Empleado();

        try {
            empleado.setNombre("Derick");
            empleado.setSalario(4500);

            empleado.mostrarDatos();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}