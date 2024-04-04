package n1ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> listaString = Arrays.asList("Hola", "Mundo", "Java", "Lambdas", "Olas");

        System.out.println(buscarPalabra.apply(listaString));

    }

    private static final Function<List<String>, List<String>> buscarPalabra = lista -> lista.stream()
            .filter(cadena -> cadena.toLowerCase().contains("o"))
            .collect(Collectors.toList());
}
