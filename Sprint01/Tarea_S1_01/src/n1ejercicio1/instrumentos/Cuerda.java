package n1ejercicio1.instrumentos;

public class Cuerda extends Instrumentos{
    public Cuerda(String nombre, double precio) {
        super(nombre, precio);
    }

    public String tocar() {
        return "Está sonando un instrumento de cuerda";
    }

    static {
        System.out.println("Clase InstrumentoCuerda cargada");
    }

    public static String metodoStatic() {
        return "Llamada al método estático InstrumentoCuerda";
    }
}
