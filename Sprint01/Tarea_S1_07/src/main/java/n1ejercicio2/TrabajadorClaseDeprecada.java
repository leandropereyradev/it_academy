package n1ejercicio2;

import n1ejercicio1.trabajador.Trabajador;

public class TrabajadorClaseDeprecada extends Trabajador {
    public TrabajadorClaseDeprecada(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Override
    public double calcularSueldo(double horasTrabajadas) {
        return horasTrabajadas * super.getPrecioHora();
    }

    @Override
    public String getInfo() {
        return super.getNombreCompleto();
    }

    @Deprecated
    public void metodoDeprecado() {
        System.out.println("Este método está obsoleto.");
    }
}
