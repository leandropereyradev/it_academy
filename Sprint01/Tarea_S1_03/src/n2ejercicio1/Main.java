package n2ejercicio1;

import java.util.HashSet;
import java.util.Scanner;

import static n2ejercicio1.IntroducirRestaurante.introducirRestaurante;

public class Main {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        HashSet<Restaurante> restaurantes = new HashSet<>();

        introducirRestaurante(restaurantes, entrada);

        entrada.close();
    }
}
