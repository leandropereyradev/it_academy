package n2ejercicio1;

import java.util.List;
import java.util.stream.Collectors;

public class NombresPropios {
    public static List<String> getNombresA(List<String> nombres) {

        return nombres.stream()
                .filter(nombre -> (nombre.indexOf('A') != -1) && nombre.length() == 3)
                .collect(Collectors.toList());
    }
}
