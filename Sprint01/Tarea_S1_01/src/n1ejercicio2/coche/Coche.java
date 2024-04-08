package n1ejercicio2.coche;

public class Coche {
    private static final String MARCA = "Renault";
    private static String modelo = "Modelo por defecto";
    private final double potencia;

    public Coche(double potencia){
        this.potencia = potencia;
    }

    public static String getMarca(){
        return MARCA;
    }

    public String getModelo(){
        return modelo;
    }

    public double getPotencia(){
        return potencia;
    }

    public static void setModelo(String modelo) {
        Coche.modelo = modelo;
    }

    public static String frenar() {
        return "El vehículo está frenando";
    }

    public String acelerar() {
        return "El vehículo está acelerando";
    }

}
