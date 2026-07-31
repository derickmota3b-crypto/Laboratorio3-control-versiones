public class App {

    public static void main(String[] args) {

        Persona persona = new Persona();

        try {
            persona.setNombre("Derick");
            persona.setEdad(18);

            persona.mostrarDatos();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}