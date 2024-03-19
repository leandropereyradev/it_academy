package n2ejercicio4;

import java.util.ArrayList;
import java.util.List;

import static n2ejercicio4.OrdenarCadenas.*;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("Hola", "3", "padre", "45", "Murciélago", "pibe", "8546"));

        System.out.println("Ordenar alfabéticamente por el primer carácter");
        System.out.println(primerCaracter(lista));

        System.out.println("\nOrdenar colocando las cadenas que contienen 'e' primero:");
        System.out.println(porLetraE(lista));

        System.out.println("\nModificados reemplazando 'a' por '4':");
        System.out.println(cambiarApor4(lista));

        System.out.println("\nMostrar sólo los elementos numéricos:");
        System.out.println(soloCadenaNumeros(lista));
    }
}
