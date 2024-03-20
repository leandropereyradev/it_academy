package n1ejercicio4;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la ruta del archivo .txt a leer sin comillas:");
        String directorio = entrada.nextLine();

        leerTxt(directorio);

        entrada.close();
    }

    static void leerTxt(String archivoPath) {
        File archivo = new File(archivoPath);

        try{
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String lineas;

            while((lineas = bufferedReader.readLine()) != null) {
                System.out.println(lineas);
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
