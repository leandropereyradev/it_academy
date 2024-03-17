package n2ejercicio1;

public class Restaurante {

    public Restaurante(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    private String nombre;
    private int puntuacion;

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public String getInformacion() {
        return "Restaurante: " + nombre + "\n\tPuntuación: " + puntuacion;
    }
}
