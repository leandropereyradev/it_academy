package n2ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nombresPropios = new ArrayList<>(List.of("Ana", "ana", "Laura", "Ariadna", "ari", "Ari"));

        List<String> nombresA = NombresPropios.getNombresA(nombresPropios);

        for(String nombre : nombresA) {
            System.out.println(nombre);
        }
    }
}
