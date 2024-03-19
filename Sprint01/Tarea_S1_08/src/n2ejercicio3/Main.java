package n2ejercicio3;

import static n2ejercicio3.Aritmetica.matematicas;

public class Main {
    public static void main(String[] args) {

        System.out.println("Suma: " + matematicas("suma", 1.8f, 5.9f));

        System.out.println("Resta: " + matematicas("resta", 1.8f, 5.9f));

        System.out.println("Multiplicacion: " + matematicas("multiplicacion", 1.8f, 5.9f));

        System.out.println("División: " + matematicas("division", 1.8f, 5.9f));
    }


}
