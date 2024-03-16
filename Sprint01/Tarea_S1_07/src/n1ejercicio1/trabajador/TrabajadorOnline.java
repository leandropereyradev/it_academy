package n1ejercicio1.trabajador;

public class TrabajadorOnline extends Trabajador{
    public TrabajadorOnline(String nombre, String apellido, double precioHora, double tarifaPlanaInternet) {
        super(nombre, apellido, precioHora);

        this.tarifaPlanaInternet = tarifaPlanaInternet;
    }

    private double tarifaPlanaInternet;

    @Override
    public double calcularSueldo(double horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + tarifaPlanaInternet;
    }

    public double getTarifaPlanaInternet() {
        return tarifaPlanaInternet;
    }
}
