package n1ejercicio5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Leandro", 40);

        serializarDirectorio(persona);
        deserializarDirectorio();
    }

    static void serializarDirectorio(Persona persona) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {
            out.writeObject(persona);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void deserializarDirectorio() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("persona.dat"))) {
            Persona person = (Persona) in.readObject();

            System.out.println(person.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Persona implements Serializable {

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    private String nombre;
    private int edad;

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
