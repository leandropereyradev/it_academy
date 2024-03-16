package n1ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> listaString = Arrays.asList("Hola", "Mundos", "Java", "Lambdas", "Olas", "Murcielago");

        System.out.println(BuscarPalabras(listaString));

    }

    static List<String> BuscarPalabras(List<String> lista) {
        return lista.stream()
                .filter(cadena -> cadena.toLowerCase().contains("o") && cadena.length() > 5)
                .collect(Collectors.toList());

    }
}
