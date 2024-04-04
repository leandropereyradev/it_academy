package n1ejercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerTxt {
    public static void leerTxt(String archivoPath) {
        File archivo = new File(archivoPath);

        try {
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String lineas;

            while ((lineas = bufferedReader.readLine()) != null) {
                System.out.println(lineas);
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
