package n1ejercicio7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> lista = Arrays.asList("Enero", 1, "Febrero", "Marzo", "Abril", 2, "Mayo", "Junio",
                "Julio", 3, "Agosto", "Septiembre", 2.68, "Octubre", "Noviembre", 0.78, "Diciembre");

        lista.stream()
                .filter(elemento -> elemento instanceof String)
                .map(String.class :: cast)
                .sorted(Comparator.comparing(String :: length).reversed())
                .forEach(System.out :: println);
    }
}
