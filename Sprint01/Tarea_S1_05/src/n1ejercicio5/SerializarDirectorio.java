package n1ejercicio5;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializarDirectorio {
    public static void serializarDirectorio(Persona persona) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {
            out.writeObject(persona);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
