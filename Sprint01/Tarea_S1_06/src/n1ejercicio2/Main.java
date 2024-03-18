package n1ejercicio2;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Leandro", "Pereyra", 40);
        String saludo = "Hola!";
        int numero = 1;

        GenericMethods.imprimirObjetos(persona, saludo, numero);

        System.out.println("\nCambio de orden:");
        GenericMethods.imprimirObjetos(saludo, numero, persona);
    }
}
