package n1ejercicio1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la ruta del directorio:");
        String directorio = entrada.nextLine();

        listarDirectorio(directorio);

        entrada.close();
    }

    static void listarDirectorio(String dir) {

        File directorio = new File(dir);
        File[] files = directorio.listFiles();

        if (files != null) {
            Arrays.sort(files);

            for (File file : files) {
                System.out.println(file.getName());
            }

        } else {
            System.out.println("El directorio está vacío o no existe.");
        }
    }
}
