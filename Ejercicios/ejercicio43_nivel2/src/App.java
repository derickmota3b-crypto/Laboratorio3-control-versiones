public class App {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();

        try {
            estudiante.setNombre("Derick");
            estudiante.setNota1(85);
            estudiante.setNota2(90);
            estudiante.setNota3(95);

            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Promedio: " + estudiante.calcularPromedio());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}