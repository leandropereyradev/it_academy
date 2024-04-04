package n1ejercicio8;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        PalabraInversa palabraInv = palabra -> sb.append(palabra).reverse().toString();

        String palabra = "Hola";

        System.out.println("Palabra original: " + palabra);
        System.out.println("Palabra invertida: " + palabraInv.reverse(palabra));
    }
}
