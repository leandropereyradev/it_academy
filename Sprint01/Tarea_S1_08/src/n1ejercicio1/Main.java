package n1ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> listaString = Arrays.asList("Hola", "Mundo", "Java", "Lambdas", "Olas");

        System.out.println(palabras_con_o(listaString));

    }

    static List<String> palabras_con_o(List<String> lista) {
        return lista.stream()
                .filter(cadena -> cadena.toLowerCase().contains("o"))
                .collect(Collectors.toList());

    }
}
