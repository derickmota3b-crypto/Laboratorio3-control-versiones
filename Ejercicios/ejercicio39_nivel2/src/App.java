public class App {

    public static void main(String[] args) {

        Producto producto = new Producto();

        try {
            producto.setNombre("Laptop");
            producto.setPrecio(6500.00);

            producto.mostrarProducto();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}