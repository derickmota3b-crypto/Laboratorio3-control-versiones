public class Producto {

    private double precio;

    public Producto() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws Exception {
        if (precio < 0) {
            throw new Exception("El precio no puede ser negativo.");
        }

        this.precio = precio;
    }

}