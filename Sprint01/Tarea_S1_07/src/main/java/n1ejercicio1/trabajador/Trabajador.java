package n1ejercicio1.trabajador;

public abstract class Trabajador {

    private String nombre;
    private String apellido;
    protected double precioHora;

    public Trabajador(String nombre, String apellido, double precioHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.precioHora = precioHora;
    }

    public abstract double calcularSueldo(double horasTrabajadas);

    public double getPrecioHora() {
        return precioHora;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public abstract String getInfo();
}
