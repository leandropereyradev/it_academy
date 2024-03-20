package n1ejercicio2;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la ruta del directorio:");
        String directorio = entrada.nextLine();

        listarDirectorio(directorio, 0);

        entrada.close();
    }

    static void listarDirectorio(String dir, int nivel) {

        File directorio = new File(dir);
        File[] files = directorio.listFiles();

        if (files != null) {
            Arrays.sort(files);

            for (File file : files) {
                Date fecha = new Date(file.lastModified());

                if(file.isDirectory()) {

                    for(int i = 0; i < nivel; i++){
                        System.out.print("_ _ ");
                    }

                    System.out.println("[D] " + file.getName() + " - Last modification: " + fecha);

                } else {

                    for(int i = 0; i < nivel; i++){
                        System.out.print("_ _ ");
                    }

                    System.out.println("[F] " + file.getName() + " - Last modification: " + fecha);
                }

                if(file.isDirectory()) {
                    listarDirectorio(file.getPath(), nivel + 1);
                }
            }
        } else {
            System.out.println("El directorio está vacío o no existe.");
        }
    }
}
