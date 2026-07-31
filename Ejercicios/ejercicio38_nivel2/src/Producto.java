public class Producto {

    private double precio;

    public Producto() {
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

}