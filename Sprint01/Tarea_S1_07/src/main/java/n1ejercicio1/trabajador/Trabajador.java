package n1ejercicio1.trabajador;

public class Trabajador {

    public Trabajador(String nombre, String apellido, double precioHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.precioHora = precioHora;
    }

    private String nombre;
    private String apellido;
    private double precioHora;

    public double calcularSueldo(double horasTrabajadas) {
        return horasTrabajadas * precioHora;
    }

    public double getPrecioHora() {
        return precioHora;
    }

}
