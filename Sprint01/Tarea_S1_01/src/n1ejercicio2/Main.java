package n1ejercicio2;

import n1ejercicio2.coche.Coche;

public class Main {
    public static void main(String[] args) {
        //Llamada al método estático
        System.out.println(Coche.frenar());

        //Llamada al método no estático
        Coche coche1 = new Coche(4.5);
        System.out.println(coche1.acelerar());

        System.out.println();

        //Obtener atributos
        System.out.println("Marca estático final: " + Coche.getMarca());
        System.out.println("Modelo estático coche1: " + coche1.getModelo());
        System.out.println("Potencia final coche1: " + coche1.getPotencia());

        System.out.println();

        //Al tener un atributo estático, este cambia al instanciar una nueva clase diferente
        Coche coche2 = new Coche(2.3);

        System.out.println("Modelo estático coche2: " + coche2.getModelo());
        System.out.println("Potencia final coche2: " + coche2.getPotencia());

        System.out.println();

        System.out.println("Cambiamos modelo a 'Megane' a traves de un setter");
        Coche.setModelo("Megane");

        System.out.println();

        System.out.println("Modelo estático coche1 coge el nuevo modelo asignado: " + coche1.getModelo());
        System.out.println("Modelo estático coche2 coge el nuevo modelo asignado: " + coche2.getModelo());

    }
}
