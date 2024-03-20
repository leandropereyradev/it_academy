package n2ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la ruta del directorio sin comillas:");
        String directorio = entrada.nextLine();

        System.out.println("Introduzca el nombre del archivo destino:");
        String nombreArchivo = entrada.nextLine();

        System.out.println("Introduzca la ruta donde guardar el archivo generado sin comillas:");
        String destino = entrada.nextLine();

        listarDirectorio(directorio, 0, destino, nombreArchivo);

        entrada.close();
    }

    static void listarDirectorio(String dir, int nivel, String destino, String nombreArchivo) {

        File directorio = new File(dir);
        File[] files = directorio.listFiles();

        if (files != null) {
            Arrays.sort(files);

            for (File file : files) {
                Date fecha = new Date(file.lastModified());

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(destino + "\\" + nombreArchivo + ".txt", true))) {

                    if(file.isDirectory()) {

                        for(int i = 0; i < nivel; i++){
                            writer.write("_ _ ");
                        }

                        writer.write("[D] " + file.getName() + " - Last modification: " + fecha);

                    } else {

                        for(int i = 0; i < nivel; i++){
                            writer.write("_ _ ");
                        }

                        writer.write("[F] " + file.getName() + " - Last modification: " + fecha);
                    }

                    writer.newLine();

                } catch (IOException e) {
                    e.printStackTrace();
                }

                if(file.isDirectory()) {
                    listarDirectorio(file.getPath(), nivel + 1, destino, nombreArchivo);
                }
            }
        } else {
            System.out.println("El directorio está vacío o no existe.");
        }
    }
}
