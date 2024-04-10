package n1ejercicio1;

public class Venta {
    private Producto[] productos;
    private double total_venta;

    public Venta(Producto[] productos) throws VentaBuidaException {
        if (productos == null || productos.length == 0) {
            throw new VentaBuidaException("Para hacer una venta primero debes añadir productos");
        }

        this.productos = productos;
    }

    public double calcularTotal() {

        for(Producto producto : productos) {
            total_venta += producto.getPrecio();
        }

        return total_venta;
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - " + producto.getPrecio() + "€");
        }
    }
}
