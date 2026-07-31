import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();

        try {
            Producto producto1 = new Producto();
            producto1.setNombre("Laptop");
            producto1.setPrecio(6500.00);

            Producto producto2 = new Producto();
            producto2.setNombre("Mouse");
            producto2.setPrecio(150.00);

            Producto producto3 = new Producto();
            producto3.setNombre("Teclado");
            producto3.setPrecio(350.00);

            productos.add(producto1);
            productos.add(producto2);
            productos.add(producto3);

            for (Producto producto : productos) {
                producto.mostrarProducto();
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}