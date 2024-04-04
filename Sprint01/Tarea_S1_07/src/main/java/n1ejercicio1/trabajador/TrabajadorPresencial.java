package n1ejercicio1.trabajador;

import static n1ejercicio1.FormatoDecimal.formatoDecimal;

public class TrabajadorPresencial extends Trabajador{

    private static double gasolina;

    static {
        gasolina = 0;
    }

    public TrabajadorPresencial(String nombre, String apellido, double precioHora, double ImporteGasolinaConsumida) {
        super(nombre, apellido, precioHora);
        gasolina = ImporteGasolinaConsumida;
    }

    @Override
    public double calcularSueldo(double horasTrabajadas) {
        return horasTrabajadas * super.getPrecioHora() + gasolina;
    }

    public double getImporteTotalGasolina() {
        return gasolina;
    }

    @Override
    public String getInfo() {
        return "Sueldo del trabajador presencial: " + getNombreCompleto() +
                "\n\tPrecio por hora: " + formatoDecimal(getPrecioHora()) + "€" +
                "\n\tImporte a pagar gasolina consumida: " + formatoDecimal(getImporteTotalGasolina()) + "€";
    }
}
