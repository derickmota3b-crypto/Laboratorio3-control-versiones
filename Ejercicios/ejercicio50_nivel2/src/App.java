public class App {

    public static void main(String[] args) {

        try {
            Empleado empleado1 = new Empleado();
            empleado1.setNombre("Derick");
            empleado1.setSalario(4500);

            Empleado empleado2 = new Empleado();
            empleado2.setNombre("María");
            empleado2.setSalario(5200);

            Empleado empleado3 = new Empleado();
            empleado3.setNombre("Carlos");
            empleado3.setSalario(6100);

            empleado1.mostrarDatos();
            System.out.println();

            empleado2.mostrarDatos();
            System.out.println();

            empleado3.mostrarDatos();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}