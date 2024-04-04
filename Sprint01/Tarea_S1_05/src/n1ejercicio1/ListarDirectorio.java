package n1ejercicio1;

import java.io.File;
import java.util.Arrays;

public class ListarDirectorio {
    public static void listarDirectorio(String dir) {

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
