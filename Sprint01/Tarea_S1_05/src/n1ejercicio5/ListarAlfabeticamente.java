//package n1ejercicio5;

import java.io.*;
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

    public static void leerTxt(String archivoPath) {
        File archivo = new File(archivoPath);

        try{
            FileReader fileReader = new FileReader(archivo);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String lineas;

            while((lineas = bufferedReader.readLine()) != null) {
                /*String[] partes = lineas.split(" ");

                pais_capital.put(partes[0], partes[1]);*/
                System.out.println(lineas);
            }

            bufferedReader.close();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void serializacion(Object objeto){
        try (FileOutputStream fileOut = new FileOutputStream("archivo.ser");
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)){

            objectOut.writeObject(objeto);

            System.out.println("Objeto serializado correctamente");

        } catch (IOException error) {
            error.printStackTrace();
        }
    }

}
