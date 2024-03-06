package n1ejercicio1.instrumentos;

abstract class Instrumentos {
    public Instrumentos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    private String nombre;
    private double precio;

    public abstract String tocar();
}
