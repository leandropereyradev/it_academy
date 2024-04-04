package n1ejercicio1.instrumento;

public class Viento extends Instrumento {

    static {
        System.out.println("Clase InstrumentoViento cargada");
    }

    public Viento(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String tocar() {
        return "Está sonando un instrumento de viento";
    }

    public static String metodoStatic() {
        return "Llamada al método estático InstrumentoViento";
    }
}
