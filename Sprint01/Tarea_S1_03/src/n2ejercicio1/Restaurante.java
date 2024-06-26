package n2ejercicio1;

import java.util.Objects;

public class Restaurante {

    private String nombre;
    private int puntuacion;

    public Restaurante(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public String getInformacion() {
        return "Restaurante: " + nombre + "\n\tPuntuación: " + puntuacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, puntuacion);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Restaurante restaurante = (Restaurante) obj;

        return puntuacion == restaurante.puntuacion &&
                Objects.equals(nombre, restaurante.nombre);
    }
}
