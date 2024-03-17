package n2ejercicio1;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        HashSet<Restaurante> restaurantes = new HashSet<>();

        introducirRestaurante(restaurantes);

        entrada.close();
    }

    static void introducirRestaurante(HashSet<Restaurante> restaurantes) {

        int opcion;
        boolean salir = false;

        while (!salir) {

            try {
                System.out.println("1. Agregar nuevo restaurante\n2. Listar restaurantes\n3. Salir");
                System.out.println("\nSelección:");
                opcion = entrada.nextInt();
                entrada.nextLine();

                salir = chechOpcion(opcion, restaurantes);

            } catch (InputMismatchException e) {
                System.out.println("Introduzca un valor entero válido.");
                entrada.nextLine();

            }

        }

        entrada.close();

    }

    static boolean chechOpcion(int opcion, HashSet<Restaurante> restaurantes) {

        switch (opcion) {
            case 1:
                System.out.println("\n\tNombre del restaurante:");
                String nombre = entrada.nextLine();

                System.out.println("\n\tPuntuación del restaurante:");
                int puntuacion = entrada.nextInt();

                entrada.nextLine();

                checkRestaurante(restaurantes, nombre, puntuacion);

                System.out.println();
                break;

            case 2:
                System.out.println("\n\tCantidad de restaurantes ingresados: " + restaurantes.size() + "\n");

                restaurantes.forEach(restaurante -> System.out.println("\t" + restaurante.getInformacion() + "\n"));

                System.out.println();
                break;

            case 3:
                return true;

            default:
                System.out.println("Introduzca una opción válida. \n");
                break;

        }

        return false;
    }

    static void checkRestaurante(HashSet<Restaurante> restaurantes, String nombre, int puntuacion) {
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
