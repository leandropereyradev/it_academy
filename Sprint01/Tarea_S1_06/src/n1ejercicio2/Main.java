package n1ejercicio2;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Leandro", "Pereyra", 40);
        String saludo = "Hola!";
        int numero = 1;

        Object[] objetos = new Object[3];
        objetos[0] = persona;
        objetos[1] = saludo;
        objetos[2] = numero;

        GenericMethods.imprimirObjetos(objetos);
    }
}
