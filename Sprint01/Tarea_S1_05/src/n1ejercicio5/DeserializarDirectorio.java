package n1ejercicio5;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializarDirectorio {
    public static void deserializarDirectorio() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("persona.dat"))) {
            Persona person = (Persona) in.readObject();

            System.out.println(person.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
