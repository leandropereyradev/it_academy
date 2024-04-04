package n1ejercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class ListarDirectorio {
    public static void listarDirectorio(String dir, int nivel, String destino) {

        File directorio = new File(dir);
        File[] files = directorio.listFiles();

        if (files != null) {
            Arrays.sort(files);

            for (File file : files) {
                Date fecha = new Date(file.lastModified());

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(destino + "\\directorio.txt", true))) {

                    if (file.isDirectory()) {

                        for (int i = 0; i < nivel; i++) {
                            writer.write("_ _ ");
                        }

                        writer.write("[D] " + file.getName() + " - Last modification: " + fecha);

                    } else {

                        for (int i = 0; i < nivel; i++) {
                            writer.write("_ _ ");
                        }

                        writer.write("[F] " + file.getName() + " - Last modification: " + fecha);
                    }

                    writer.newLine();

                } catch (IOException e) {
                    System.out.println("Error: " + e);
                }

                if (file.isDirectory()) {
                    listarDirectorio(file.getPath(), nivel + 1, destino);
                }
            }
        } else {
            System.out.println("El directorio está vacío o no existe.");
        }
    }
}
