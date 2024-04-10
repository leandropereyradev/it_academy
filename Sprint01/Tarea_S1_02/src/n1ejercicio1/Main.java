package n1ejercicio1;

import java.util.function.IntFunction;

public class Main {

    public static void main(String[] args) {
        IntFunction<String> line = "-"::repeat;

        System.out.println("Venta sin productos:");

        try {
            Producto[] sin_productos = new Producto[0];

            Venta venta_sin_productos = new Venta(sin_productos);

            venta_sin_productos.listarProductos();

            System.out.println(venta_sin_productos.calcularTotal() + " €");

        } catch (VentaBuidaException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());

        }

        System.out.println(line.apply(70));
        System.out.println("\nVenta con productos:");

        try {
            Producto[] productos = new Producto[2];
            productos[0] = new Producto("Pan", 1.2);
            productos[1] = new Producto("Vino", 4.5);

            Venta venta_con_productos = new Venta(productos);

            venta_con_productos.listarProductos();

            System.out.println("Total: " + venta_con_productos.calcularTotal() + "€");

            System.out.println(line.apply(70));

            Producto producto_fuera_rango = productos[6];

        } catch (VentaBuidaException | ArrayIndexOutOfBoundsException e) {

            System.out.println("\nSe intenta accceder a un producto fuera de rango:" +
                    "\n\t Producto[] productos = new Producto[2]" +
                    "\n\t Producto producto_fuera_rango = productos[6]:\n");

            System.out.println("Error: " + e.getMessage());

        }

    }
}
