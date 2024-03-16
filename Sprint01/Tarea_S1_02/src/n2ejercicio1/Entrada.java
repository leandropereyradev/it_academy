package n2ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    private static Scanner entrada = new Scanner(System.in);

    public static byte leerByte(String mensaje) {
        byte byteLeer = 0;
        boolean ok = false;

        do {
            System.out.println(mensaje);

            try {
                byteLeer = entrada.nextByte();
                ok = true;

            } catch (InputMismatchException e) {
                System.out.println("Introduzca un tipo 'byte' válido");
            }

            entrada.nextLine();

        } while (!ok);

        System.out.println("Has ingresado un tipo 'byte' válido!");
        return byteLeer;

    }

    public static int leerInt(String mensaje) {
        int intLeer = 0;
        boolean ok = false;

        do {
            System.out.println(mensaje);

            try {
                intLeer = entrada.nextInt();
                ok = true;

            } catch (InputMismatchException e) {
                System.out.println("Introduzca un tipo 'int' válido");
            }

            entrada.nextLine();

        } while (!ok);

        System.out.println("Has ingresado un tipo 'int' válido!");
        return intLeer;
    }

    public static float leerFloat(String mensaje) {
        float floatLeer = 0f;
        boolean ok = false;

        do {
            System.out.println(mensaje);

            try {
                floatLeer = entrada.nextFloat();
                ok = true;

            } catch (InputMismatchException e) {
                System.out.println("Introduzca un tipo 'float' válido");
            }

            entrada.nextLine();

        } while (!ok);

        System.out.println("Has ingresado un tipo 'float' válido!");
        return floatLeer;
    }

    public static double leerDouble(String mensaje) {
        double doubleLeer = 0.0;
        boolean ok = false;

        do {
            System.out.println(mensaje);

            try {
                doubleLeer = entrada.nextDouble();
                ok = true;

            } catch (InputMismatchException e) {
                System.out.println("Introduzca un tipo 'double' válido");
            }

            entrada.nextLine();

        } while (!ok);

        System.out.println("Has ingresado un tipo 'double' válido!");
        return doubleLeer;
    }

    public static char leerChar(String mensaje) {
        char charLeer = ' ';
        boolean ok = false;

        do {
            System.out.println(mensaje);

            try {
                charLeer = entrada.next().charAt(0);
                ok = true;

            } catch (Exception e) {
                System.out.println("Introduzca un tipo 'char' válido");
            }

            entrada.nextLine();

        } while (!ok);

        System.out.println("Has ingresado un tipo 'char' válido!");
        return charLeer;
    }

    public static String leerString(String mensaje) {
        String stringLeer = "";
        boolean ok = false;

        do {
            System.out.println(mensaje);

            try {
                stringLeer = entrada.nextLine();
                ok = true;

            } catch (Exception e) {
                System.out.println("Introduzca un tipo 'String' válido");
            }

            entrada.nextLine();

        } while (!ok);

        System.out.println("Has ingresado un tipo 'String' válido!");
        return stringLeer;
    }

    public static boolean leerSiNo(String mensaje) {
        boolean booleanLeer = false;
        boolean ok = false;
        String respuesta = "";

        do {
            System.out.println(mensaje);
            respuesta = entrada.nextLine();

            try {
                if (respuesta.equalsIgnoreCase("s")) {
                    booleanLeer = true;
                    ok = true;

                } else if (respuesta.equalsIgnoreCase("n")) {
                    booleanLeer = false;
                    ok = true;

                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Introduzca un tipo 'boolean' válido");
            }

            entrada.nextLine();

        } while (!ok);

        System.out.println("Has ingresado un tipo 'boolean' válido!");
        return booleanLeer;
    }
}
