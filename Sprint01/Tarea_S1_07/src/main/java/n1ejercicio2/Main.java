package n1ejercicio2;


public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        TrabajadorClaseDeprecada claseDeprecada = new TrabajadorClaseDeprecada("Carlos", "Pérez", 11.35);

        claseDeprecada.metodoDeprecado();
    }

    /* Otra opción
        public static void main(String[] args) {
            TrabajadorClaseDeprecada deprecada = new TrabajadorClaseDeprecada("Carlos", "Pérez", 11.35);

            metodoDeprecado(deprecada);
        }

        @SuppressWarnings("deprecation")
        public static void metodoDeprecado(TrabajadorClaseDeprecada deprecada) {
            deprecada.metodoDeprecado();
        }
     */
}

