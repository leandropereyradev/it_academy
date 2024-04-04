package n2ejercicio1;

import java.util.HashSet;
import java.util.Scanner;

import static n2ejercicio1.ChechRestaurante.checkRestaurante;

public class CheckOption {
    public static boolean chechOpcion(int opcion, HashSet<Restaurante> restaurantes, Scanner entrada) {

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
}
