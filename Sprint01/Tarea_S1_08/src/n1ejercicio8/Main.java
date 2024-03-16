package n1ejercicio8;

@FunctionalInterface
interface palabraInversa {
    String reverse(String palabra);
}

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        palabraInversa palabraInv = palabra -> sb.append(palabra).reverse().toString();

        String palabra = "Hola";

        System.out.println("Palabra original: " + palabra);
        System.out.println("Palabra invertida: " + palabraInv.reverse(palabra));
    }
}
