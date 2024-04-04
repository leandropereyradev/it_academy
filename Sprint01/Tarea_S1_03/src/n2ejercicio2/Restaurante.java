package n2ejercicio2;

import java.util.Objects;

public class Restaurante implements Comparable<Restaurante> {

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

    @Override
    public int compareTo(Restaurante otroRestaurante) {

        int comparacionPorNombre = this.nombre.compareTo(otroRestaurante.nombre);

        if (comparacionPorNombre != 0) {
            return comparacionPorNombre;
        }

        return Integer.compare(this.puntuacion, otroRestaurante.puntuacion);
    }
}
