package n1ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> listaString = Arrays.asList("Hola", "Mundos", "Java", "Lambdas", "Olas", "Murcielago");

        System.out.println(buscarPalabras.apply(listaString));

    }

    private static final Function<List<String>, List<String>> buscarPalabras = lista -> lista.stream()
            .filter(cadena -> cadena.toLowerCase().contains("o") && cadena.length() > 5)
            .collect(Collectors.toList());
}
