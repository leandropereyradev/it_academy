package n2ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaIntegerOE {
    public static String devuelveCadena(List<Integer> numeros) {

        Iterator<Integer> iterador = numeros.stream().iterator();

        List<String> listaNumerosString = new ArrayList<>();

        while (iterador.hasNext()){
            int numero = iterador.next();

            if(numero % 2 == 0) {
                listaNumerosString.add("e" + numero);
            } else {
                listaNumerosString.add("o" + numero);
            }
        }

        return String.join(",", listaNumerosString);
    }
}
