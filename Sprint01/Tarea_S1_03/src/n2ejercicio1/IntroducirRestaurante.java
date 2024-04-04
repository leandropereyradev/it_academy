package n2ejercicio1;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

import static n2ejercicio1.CheckOption.chechOpcion;

public class IntroducirRestaurante {
    public static void introducirRestaurante(HashSet<Restaurante> restaurantes, Scanner entrada) {

        int opcion;
        boolean salir = false;

        while (!salir) {

            try {
                System.out.println("1. Agregar nuevo restaurante\n2. Listar restaurantes\n3. Salir");
                System.out.println("\nSelección:");
                opcion = entrada.nextInt();
                entrada.nextLine();

                salir = chechOpcion(opcion, restaurantes, entrada);

            } catch (InputMismatchException e) {
                System.out.println("Introduzca un valor entero válido.");
                entrada.nextLine();

            }

        }

        entrada.close();

    }
}
