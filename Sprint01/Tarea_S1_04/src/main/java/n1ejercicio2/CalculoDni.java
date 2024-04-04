package n1ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class CalculoDni {
    private static final List<String> LETRA = new ArrayList<>(List.of("T", "R", "W", "A", "G",
            "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"));

    public static String getLetra(int numDni) {

        int resto = numDni % 23;
        String letraDni = LETRA.get(resto);

        return letraDni;
    }
}
