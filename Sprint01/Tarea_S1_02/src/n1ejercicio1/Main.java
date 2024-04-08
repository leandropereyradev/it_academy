package n1ejercicio1;

public class Main {

    public static void main(String[] args) throws VentaBuidaException {
        System.out.println("Venta sin productos:");

        try {
            Producto[] sin_productos = new Producto[0];

            Venta venta_sin_productos = new Venta(sin_productos);
            System.out.println(venta_sin_productos.calcularTotal() + " €");

        } catch (VentaBuidaException e) {
            System.out.println("Error: " + e.getMessage());
        }


        System.out.println();
        System.out.println("Venta con productos:");

        try {
            Producto[] productos = new Producto[2];
            productos[0] = new Producto("Pan", 1.2);
            productos[1] = new Producto("Vino", 4.5);

            Venta venta_con_productos = new Venta(productos);
            System.out.println(venta_con_productos.calcularTotal() + " €");

        } catch (VentaBuidaException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
