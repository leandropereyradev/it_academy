package n2ejercicio1;

import java.util.HashSet;

public class ChechRestaurante {
    public static void checkRestaurante(HashSet<Restaurante> restaurantes, String nombre, int puntuacion) {
        Restaurante nuevoRestaurante = new Restaurante(nombre, puntuacion);

        boolean restauranteExistente = restaurantes.stream()
                .anyMatch(restaurante -> restaurante.getNombre().equalsIgnoreCase(nombre)
                        && restaurante.getPuntuacion() == puntuacion);

        if (restauranteExistente) {
            System.out.println("El restaurante ya existe con la misma puntuación. Ingrese una nueva puntuación.");

        } else {
            restaurantes.add(nuevoRestaurante);
            System.out.println("El restaurante ha sido agregado exitosamente.");
        }
    }
}
