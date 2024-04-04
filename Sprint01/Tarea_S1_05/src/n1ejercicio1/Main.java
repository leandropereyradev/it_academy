package n1ejercicio1;

import java.util.Scanner;

import static n1ejercicio1.ListarDirectorio.listarDirectorio;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la ruta del directorio:");
        String directorio = entrada.nextLine();

        listarDirectorio(directorio);

        entrada.close();
    }

}
