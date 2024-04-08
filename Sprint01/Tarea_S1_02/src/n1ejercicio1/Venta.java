package n1ejercicio1;

public class Venta {
    private Producto[] productos;
    private double total_venta;

    public Venta(Producto[] productos) throws VentaBuidaException {
        this.productos = productos;

        if (productos.length == 0 || productos == null) {
            throw new VentaBuidaException("Para hacer una venta primero debes añadir productos");
        }
    }

    public double calcularTotal() {

        for(Producto producto : productos) {
            total_venta += producto.getPrecio();
        }

        return total_venta;
    }
}
