package n1ejercicio1;

import n1ejercicio1.instrumentos.Cuerda;
import n1ejercicio1.instrumentos.Percusion;
import n1ejercicio1.instrumentos.Viento;

public class Main {
    public static void main(String[] args) {

        Viento viento = new Viento("Flauta", 50.85);
        System.out.println(viento.tocar());

        Viento viento2 = new Viento("Flauta2", 50.85);
        System.out.println(viento2.tocar());

        System.out.println(Viento.metodoStatic());

        System.out.println();

        Cuerda cuerda = new Cuerda("Guitarra", 150.5);
        System.out.println(cuerda.tocar());

        Cuerda cuerda2 = new Cuerda("Guitarra2", 150.5);
        System.out.println(cuerda2.tocar());

        System.out.println(Cuerda.metodoStatic());

        System.out.println();

        Percusion percusion = new Percusion("Timbal", 210.35);
        System.out.println(percusion.tocar());

        Percusion percusion2 = new Percusion("Timbal2", 210.35);
        System.out.println(percusion2.tocar());

        System.out.println(Percusion.metodoStatic());

    }
}
