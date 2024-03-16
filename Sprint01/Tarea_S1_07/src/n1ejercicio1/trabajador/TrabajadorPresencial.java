package n1ejercicio1.trabajador;

public class TrabajadorPresencial extends Trabajador{

    public TrabajadorPresencial(String nombre, String apellido, double precioHora, double gasolina) {
        super(nombre, apellido, precioHora);

        this.gasolina = gasolina;
    }

    private static double gasolina;

    @Override
    public double calcularSueldo(double horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + gasolina;
    }

    public double getGasolina() {
        return gasolina;
    }
}
