package n2ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Leandro", "Pereyra", 40);
        String saludo = "Hola!";
        int numero = 1;

        GenericMethods.imprimirObjetos(numero, saludo, persona);
    }
}
