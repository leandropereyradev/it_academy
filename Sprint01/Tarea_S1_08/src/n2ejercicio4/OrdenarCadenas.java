package n2ejercicio4;

import java.util.List;
import java.util.stream.Collectors;

public class OrdenarCadenas {
    public static List<String> primerCaracter(List<String> cadena) {
        return cadena.stream()
                .sorted((a, b) -> Character.compare(a.charAt(0), b.charAt(0)))
                .collect(Collectors.toList());
    };

    public static List<String> porLetraE(List<String> cadena) {
        return cadena.stream().sorted((a, b) -> {
            if(a.contains("e") && !b.contains("e")) {
                return -1;

            } else if (!a.contains("e") && b.contains("e")) {
                return 1;

            } else {
                return 0;

            }
        }).collect(Collectors.toList());
    };

    public static List<String> cambiarApor4(List<String> cadena) {
        return cadena.stream()
                .map(a -> a.replace('a', '4'))
                .collect(Collectors.toList());
    };

    public static List<String> soloCadenaNumeros(List<String> cadena) {
        return cadena.stream()
                .filter(s -> s.matches("\\d+"))
                .collect(Collectors.toList());
    };
}
