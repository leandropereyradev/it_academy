package n1ejercicio1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May","June","July","September", "October","November","December"};
        Month august = new Month("August");

        List<Month> year = new ArrayList<>();

        System.out.println("Sin mes Agosto:");
        for(String month: months) {
            year.add(new Month(month));
        }

        for(Month mes: year) {
            System.out.print(mes.getMonth() + ", ");
        }

        System.out.println("\n\nCon mes Agosto:");
        year.add(7, august);

        for(Month mes: year) {
            System.out.print(mes.getMonth() + ", ");
        }

        LinkedHashSet<Month> hashYear = new LinkedHashSet<>();
        hashYear.addAll(year);
        hashYear.add(august);

        System.out.println("\n\nHashSet (LinkedHashSet) con objeto 'august' original - sin duplicidad:");
        for(Month mes: hashYear) {
            System.out.print(mes.getMonth() + ", ");
        }

        hashYear.add(new Month("August"));
        System.out.println("\n\nHashSet (LinkedHashSet) con objeto nuevo argumento 'August' - con duplicidad por ser diferentes objetos:");
        for(Month mes: hashYear) {
            System.out.print(mes.getMonth() + ", ");
        }

        System.out.println("\n\nIterator:");
        ListIterator<Month> iterador = year.listIterator();

        while (iterador.hasNext()) {
            System.out.print(iterador.next().getMonth() + ", ");
        }

    }
}

