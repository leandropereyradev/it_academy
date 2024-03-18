package n2ejercicio1;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Leandro");

        Serializador.toJSON(persona);

    }

}
