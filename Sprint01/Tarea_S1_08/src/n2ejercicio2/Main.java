package n2ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros1 = new ArrayList<>(List.of(3, 55, 44));
        System.out.println(ListaIntegerOE.devuelveCadena(numeros1));

        List<Integer> numeros2 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println(ListaIntegerOE.devuelveCadena(numeros2));
    }
}
