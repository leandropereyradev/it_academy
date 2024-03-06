package n1ejercicio1.instrumentos;

public class Viento extends Instrumentos{
    public Viento(String nombre, double precio) {
        super(nombre, precio);
    }

    public String tocar() {
        return "Está sonando un instrumento de viento";
    }

    static {
        System.out.println("Clase InstrumentoViento cargada");
    }

    public static String metodoStatic() {
        return "Llamada al método estático InstrumentoViento";
    }
}
