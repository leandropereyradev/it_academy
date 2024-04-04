package n1ejercicio4;

import java.util.Scanner;

import static n1ejercicio4.LeerTxt.leerTxt;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la ruta del archivo .txt a leer sin comillas:");
        String directorio = entrada.nextLine();

        leerTxt(directorio);

        entrada.close();
    }
}
