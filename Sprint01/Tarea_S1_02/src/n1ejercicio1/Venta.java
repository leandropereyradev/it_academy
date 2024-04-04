package n1ejercicio1;

public class Venta {
    private Producto[] productos;
    private double total_venta = 0;

    public Venta(Producto[] productos) {
        this.productos = productos;
    }

    public double calcularTotal() throws VentaBuidaException {

        try {
            if(productos.length == 0) {
                throw new VentaBuidaException("Para hacer una venta primero debes añadir productos");
            }

            for(Producto producto : productos) {
                total_venta += producto.getPrecio();
            }

            Producto lanzarExcepción_OutOfBounds = productos[-1];

        } catch (VentaBuidaException e) {
            String message = e.getMessage();

            System.out.println(message);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Excepción ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        return total_venta;
    }
}
