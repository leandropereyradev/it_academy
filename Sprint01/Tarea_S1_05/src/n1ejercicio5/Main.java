//package n1ejercicio5;

//import static n1ejercicio5.ListarAlfabeticamente.listarDirectorio;

//import n1ejercicio5.ListarAlfabeticamente;

//import n1ejercicio5.ListarAlfabeticamente;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, proporciona el directorio como argumento.");
            return;
        }

        String directorio = args[1];


        String flag = args[0];

        switch (flag) {
            case "-l":
                ListarAlfabeticamente.listarDirectorio(directorio, 0);
                break;

            case "-r":
                ListarAlfabeticamente.leerTxt(directorio);
                break;

            case "-s":
                File directorioFile = new File(directorio);

                if (directorioFile.isDirectory()) {
                    File[] files = directorioFile.listFiles();
                    ListarAlfabeticamente.serializacion(files);

                } else {
                    System.out.println("El directorio especificado no es válido.");

                }

                break;

            default:
                System.out.println("Flag no reconocido.");
                break;
        }

    }
}
