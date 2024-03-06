package n1ejercicio2;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> lista1 = new ArrayList<>();

        for(int num: numeros) {
            lista1.add(num);
        }

        List<Integer> lista2 = new ArrayList<>();

        //Se utiliza el .size() como argumento para que el tamaño del array sea dinámico.
        // .listIterator() utiliza el tamaño del array para indicar que debe comenzar desde el último elemento
        ListIterator<Integer> iterador = lista1.listIterator(lista1.size());

        while(iterador.hasPrevious()) {
            lista2.add(iterador.previous());
        }

        System.out.println("Lista original:");
        for(int num: lista1) {
            System.out.print(num + ", ");
        }

        System.out.println("\n\nLista invertida:");
        for(int num: lista2) {
            System.out.print(num + ", ");
        }
    }
}