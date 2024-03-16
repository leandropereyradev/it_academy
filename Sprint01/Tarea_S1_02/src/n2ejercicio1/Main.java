package n2ejercicio1;

public class Main {
    public static void main(String[] args) {
        byte leerByte = Entrada.leerByte("Cual es tu edad?");
        System.out.println("Tu edad es: " + leerByte + " años");

        int leerInt = Entrada.leerInt("Cuántos hermanos tienes?");
        System.out.println("Tienes " + leerInt + " hermanos");

        float leerFloat = Entrada.leerFloat("Cuál es tu altura en metros separado por coma?");
        System.out.println("Tu altura es: " + leerFloat + "m");

        double leerDouble = Entrada.leerDouble("Cuánto pesas en kilogramos separado por coma?");
        System.out.println("Tu peso es: " + leerDouble + "kg");

        char leerChar = Entrada.leerChar("Cuál es la inicial de tu primer nombre?");
        System.out.println("La inicial de tu nombre es: " + leerChar);

        String leerString = Entrada.leerString("Cuál es tu nombre?");
        System.out.println("Tu nombre es: " + leerString);

        boolean leerBoolean = Entrada.leerSiNo("Estás de acuerdo con los términos y condiciones? (S/N)");
        System.out.println("Acuerdo condiciones: " + (leerBoolean ?  "Sí" : "No"));
    }
}
