package n1ejercicio1.instrumento;

abstract class Instrumento {

    private String nombre;
    private double precio;

    public Instrumento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract String tocar();
}
