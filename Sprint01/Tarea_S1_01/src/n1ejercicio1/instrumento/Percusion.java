package n1ejercicio1.instrumento;

public class Percusion extends Instrumento {

    static {
        System.out.println("Clase InstrumentoPercusion cargada");
    }

    public Percusion(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String tocar() {
        return "Está sonando un instrumento de percusión";
    }

    public static String metodoStatic() {
        return "Llamada al método estático InstrumentoPercusion";
    }
}
