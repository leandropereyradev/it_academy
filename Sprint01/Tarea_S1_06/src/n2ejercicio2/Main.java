package n2ejercicio2;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Leandro", "Pereyra", 40);
        String saludo = "Hola!";
        int numero = 1;

        GenericMethods.imprimirObjetos(numero, saludo, persona, true);

        System.out.println();

        GenericMethods.imprimirObjetos(numero, 'c', saludo, 2.5F, persona, true);
    }
}
