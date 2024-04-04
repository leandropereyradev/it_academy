package n1ejercicio5;

import static n1ejercicio5.DeserializarDirectorio.deserializarDirectorio;
import static n1ejercicio5.SerializarDirectorio.serializarDirectorio;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Leandro", 40);

        serializarDirectorio(persona);
        deserializarDirectorio();
    }
}
