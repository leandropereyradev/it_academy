package n1ejercicio1.ListaOrdenada;

import java.util.ArrayList;
import java.util.List;

public class ListaOrdenada {
    private static List<String> meses = new ArrayList<>();

    public static void setMeses(String[] lista) {
        meses.addAll(List.of(lista));
    }

    public static List<String> getMeses() {
        return meses;
    }
}
