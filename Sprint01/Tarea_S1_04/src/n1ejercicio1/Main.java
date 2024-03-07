package n1ejercicio1;

import n1ejercicio1.ListaOrdenada.ListaOrdenada;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May","June","July", "August", "September", "October","November","December"};

        ListaOrdenada.setMeses(months);

        List<String> listaMeses = ListaOrdenada.getMeses();

        for (String mes : listaMeses) {
            System.out.println(mes);
        }
    }
}
