package n1ejercicio3;

import java.util.Scanner;

import static n1ejercicio3.ListarDirectorio.listarDirectorio;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la ruta del directorio sin comillas:");
        String directorio = entrada.nextLine();

        System.out.println("Introduzca la ruta donde guardar el archivo generado sin comillas:");
        String destino = entrada.nextLine();

        listarDirectorio(directorio, 0, destino);

        entrada.close();
    }

}
