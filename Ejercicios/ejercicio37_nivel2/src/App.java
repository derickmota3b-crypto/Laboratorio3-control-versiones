public class App {

    public static void main(String[] args) {

        Producto producto = new Producto();

        try {
            producto.setPrecio(250.50);

            System.out.println("Precio: Q" + producto.getPrecio());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}