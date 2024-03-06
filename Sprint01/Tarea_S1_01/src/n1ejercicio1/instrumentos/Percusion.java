package n1ejercicio1.instrumentos;

public class Percusion extends Instrumentos{
    public Percusion(String nombre, double precio) {
        super(nombre, precio);
    }

    public String tocar() {
        return "Está sonando un instrumento de percusión";
    }

    static {
        System.out.println("Clase InstrumentoPercusion cargada");
    }

    public static String metodoStatic() {
        return "Llamada al método estático InstrumentoPercusion";
    }
}
