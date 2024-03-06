package n1ejercicio2;

import n1ejercicio2.coche.Coche;

public class Main {
    public static void main(String[] args) {
        //Llamada al método estático
        System.out.println(Coche.frenar());

        //Llamada al método no estático
        Coche coche1 = new Coche("Captur", 4.5);
        System.out.println(coche1.acelerar());

        //Obtener atributos
        System.out.println("Marca estático final: " + Coche.getMarca());
        System.out.println("Modelo estático coche1: " + coche1.getModelo());
        System.out.println("Potencia final coche1: " + coche1.getPotencia());

        //Al tener un atributo estático, este cambia al instanciar una nueva clase diferente
        Coche coche2 = new Coche("Megane", 2.3);
        System.out.println("Modelo estático coche2: " + coche2.getModelo());
        System.out.println("Potencia final coche2: " + coche2.getPotencia());
        System.out.println("Modelo estático coche1 coge modelo de coche2: " + coche1.getModelo());
        System.out.println("Potencia final coche1: " + coche1.getPotencia());

    }
}
