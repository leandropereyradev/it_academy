//package n1ejercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class ListarAlfabeticamente {

    public static void listarDirectorio(String dir, int nivel) {

        File directorio = new File(dir);

        File[] files = directorio.listFiles();

        String rutaRelativa = System.getProperty("user.dir") + File.separator + "..";

        if (files != null) {
            Arrays.sort(files);

            for (File file : files) {
                Date fecha = new Date(file.lastModified());

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaRelativa + "\\directorio.txt", true))) {

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
                    listarDirectorio(file.getPath(), nivel + 1);
                }
            }
        } else {
            System.out.println("El directorio está vacío o no existe.");
        }
    }

}
