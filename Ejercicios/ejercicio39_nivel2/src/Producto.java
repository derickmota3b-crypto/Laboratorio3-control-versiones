public class Producto {

    private String nombre;
    private double precio;

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.trim().isEmpty()) {
            throw new Exception("El nombre del producto no puede estar vacío.");
        }

        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws Exception {
        if (precio <= 0) {
            throw new Exception("El precio debe ser mayor que cero.");
        }

        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: Q" + precio);
    }

}