package n1ejercicio1;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Renault");
        Coche coche2 = new Coche("Toyota");
        Coche coche3 = new Coche("Fiat");
        Coche cocheSobrante = new Coche("Coche sobrante");

        Coche[] coches1 = new Coche[4];
        coches1[0] = coche1;
        coches1[1] = coche2;
        coches1[2] = coche3;
        coches1[3] = cocheSobrante;

        System.out.println("Desde el constructor:");
        NoGenericMethods noGenericos = new NoGenericMethods(coches1);

        for (Object obj : noGenericos.getObjetos()) {

            if (obj instanceof Coche) {
                Coche coche = (Coche) obj;
                System.out.println("Nombre del coche: " + coche.getNombre());
            }
        }

        Coche coche4 = new Coche("Ford");
        Coche coche5 = new Coche("Nisan");
        Coche coche6 = new Coche("Opel");

        Coche[] coches2 = new Coche[3];
        coches2[0] = coche4;
        coches2[1] = coche5;
        coches2[2] = coche6;

        System.out.println("\nDesde el Setter:");
        noGenericos.setObjetos(coches2);

        for (Object obj : noGenericos.getObjetos()) {

            if (obj instanceof Coche) {
                Coche coche = (Coche) obj;
                System.out.println("Nombre del coche: " + coche.getNombre());
            }
        }
    }

    static class Coche {
        public Coche(String nombre) {
            this.nombre = nombre;
        }

        private String nombre;

        public String getNombre() {
            return nombre;
        }
    }
}
