package n1ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String rutaArchivo = "C:\\Users\\leand\\Desktop\\Cursos\\Java\\IT Academy\\Sprint01\\Tarea_S1_03\\src\\n1ejercicio3\\countries.txt";
        File archivo = new File(rutaArchivo);

        Map<String, String> pais_capital = new HashMap<>();

        try{
            FileReader fileReader = new FileReader(archivo);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String lineas;

            while((lineas = bufferedReader.readLine()) != null) {
                String[] partes = lineas.split(" ");

                pais_capital.put(partes[0], partes[1]);
            }

            bufferedReader.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String nombre = entrada.nextLine();

        int puntaje = 0;
        int oportunidades = 10;

        while(oportunidades > 0)  {

            oportunidades --;

            int indiceAleatorio = new Random().nextInt(pais_capital.size());
            Map.Entry<String, String> elementoAleatorio = null;

            int i = 0;
            for(Map.Entry<String, String> claveValor : pais_capital.entrySet()) {
                if (i == indiceAleatorio) {
                    elementoAleatorio = claveValor;
                    break;
                }
                i++;
            }

            String pais = elementoAleatorio.getKey();
            String capital = elementoAleatorio.getValue();

            System.out.println("Cual es la capital de " + pais + "?");
            String respuesta = entrada.nextLine();

            if (respuesta.equalsIgnoreCase(capital)) {

                if (oportunidades > 0) {
                    System.out.println("Correcto! Vamos por otra más!");
                }

                System.out.println("Correcto!");

                puntaje ++;

            } else {

                if (oportunidades > 0){
                    System.out.println(
                            "No! La capital es "
                            + capital + ". Aún te quedan "
                            + oportunidades + " oportunidades más!");
                } else {

                    System.out.println("No! La capital es " + capital + ". Gracias por jugar!");
                }

            }

        }

        System.out.println(puntaje);

    }
}
