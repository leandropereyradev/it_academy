package n1ejercicio3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String rutaRelativa = System.getProperty("user.dir") + "\\Sprint01\\Tarea_S1_03\\src";
        String archivoPaises = "\\countries.txt";
        String archivoRegistroJugadores = "\\classificacio.txt";

        File archivo = new File(rutaRelativa + archivoPaises);

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

            if(oportunidades < 10 && oportunidades > 1) {
                System.out.println("\n\n" + oportunidades + " intentos más!");

            } else if (oportunidades == 1){
                System.out.println("\n\n" + "Último intento!");

            }

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
                } else {

                    System.out.println("Correcto!");
                }

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

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaRelativa + archivoRegistroJugadores, true))) {

            writer.write(nombre + "," + puntaje);
            writer.newLine();

        } catch (IOException e) {

            e.printStackTrace();
        }

        if (puntaje == 10) {
            System.out.println("\nExcelente, " + nombre + "! Has acertado a todas las capitales (O.O)!");
            System.out.println("Capitales acertadas: " + puntaje);

        } else if (puntaje < 10 && puntaje >= 6) {
            System.out.println("\nMuy bien, " + nombre + "! Felicidades ^_^?");
            System.out.println("Capitales acertadas: " + puntaje);

        } else if (puntaje < 6 && puntaje >= 3) {
            System.out.println("\nMuy bien, " + nombre + "! pero... como vamos con geofrafía U.U?");
            System.out.println("Capitales acertadas: " + puntaje);

        }else {
            System.out.println("\nBueno... bueh, " + nombre + "... Haré como que aquí no ha sucedido nada -.-");
            System.out.println("Capitales acertadas: " + puntaje);
        }

    }
}
