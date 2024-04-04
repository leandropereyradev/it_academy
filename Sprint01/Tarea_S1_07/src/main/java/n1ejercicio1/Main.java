package n1ejercicio1;

import n1ejercicio1.trabajador.TrabajadorOnline;
import n1ejercicio1.trabajador.TrabajadorPresencial;

import static n1ejercicio1.FormatoDecimal.formatoDecimal;

public class Main {
    public static void main(String[] args) {

        double horasTrabajadasPresencial1 = 120;
        double horasTrabajadasPresencial2 = 240;
        double horasTrabajadasOnline = 80;

        TrabajadorPresencial presencial1 = new TrabajadorPresencial("Carlos",
                "Pérez", 11.35, 20.5);

        System.out.println(presencial1.getInfo());
        System.out.println("Sueldo total: " + formatoDecimal(presencial1.calcularSueldo(horasTrabajadasPresencial1)) + "€");

        System.out.println();

        TrabajadorPresencial presencial2 = new TrabajadorPresencial("Alberto",
                "Gonzalez", 14.5, 35);

        System.out.println(presencial2.getInfo());
        System.out.println("Sueldo total: " + formatoDecimal(presencial2.calcularSueldo(horasTrabajadasPresencial2)) + "€");

        System.out.println();

        TrabajadorOnline online = new TrabajadorOnline("Marcos", "García", 9.3);

        System.out.println(online.getInfo());
        System.out.println("Sueldo total: " + formatoDecimal(online.calcularSueldo(horasTrabajadasOnline)) + "€");
    }
}
