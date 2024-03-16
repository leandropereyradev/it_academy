package n1ejercicio1;

import n1ejercicio1.trabajador.TrabajadorOnline;
import n1ejercicio1.trabajador.TrabajadorPresencial;

public class Main {
    public static void main(String[] args) {
        double horasTrabajadas = 120;

        TrabajadorPresencial presencial = new TrabajadorPresencial("Carlos",
                "Pérez", 11.35, 20.5);

        System.out.println("Sueldo del Trabajador presencial:" +
                "\n\tPrecio por hora: " + presencial.getPrecioHora() + "€" +
                "\n\tGasolina consumida: " + presencial.getGasolina() + "l" +
                "\n\tSueldo total: " + presencial.calcularSueldo(horasTrabajadas)+ "€");

        System.out.println();

        TrabajadorOnline online = new TrabajadorOnline("Marcos", "García", 9.3, 180.68);

        System.out.println("Sueldo del Trabajador online:" +
                "\n\tPrecio por hora: " + online.getPrecioHora() + "€" +
                "\n\tTarifa Plana Internet: " + online.getTarifaPlanaInternet() + "€" +
                "\n\tSueldo total: " + online.calcularSueldo(horasTrabajadas)+ "€");
    }
}
