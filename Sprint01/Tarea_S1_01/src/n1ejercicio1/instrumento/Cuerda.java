package n1ejercicio1.instrumento;

public class Cuerda extends Instrumento {

    static {
        System.out.println("Clase InstrumentoCuerda cargada");
    }

    public Cuerda(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String tocar() {
        return "Está sonando un instrumento de cuerda";
    }

    public static String metodoStatic() {
        return "Llamada al método estático InstrumentoCuerda";
    }
}
