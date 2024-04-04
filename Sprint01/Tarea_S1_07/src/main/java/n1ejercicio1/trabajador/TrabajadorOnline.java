package n1ejercicio1.trabajador;

import static n1ejercicio1.FormatoDecimal.formatoDecimal;

public class TrabajadorOnline extends Trabajador{

    private final double TARIFA_PLANA = 180.68;
    public TrabajadorOnline(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Override
    public double calcularSueldo(double horasTrabajadas) {
        return horasTrabajadas * super.getPrecioHora() + TARIFA_PLANA;
    }

    public double getTarifaPlanaInternet() {
        return TARIFA_PLANA;
    }

    @Override
    public String getInfo() {
        return "Sueldo del trabajador online: " + getNombreCompleto() +
                "\n\tPrecio por hora: " + formatoDecimal(getPrecioHora()) + "€" +
                "\n\tTarifa Plana Internet: " + formatoDecimal(getTarifaPlanaInternet()) + "€";
    }
}
