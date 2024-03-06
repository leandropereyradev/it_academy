package n1ejercicio2.coche;

public class Coche {
    public Coche(String modelo, double potencia){
        this.modelo = modelo;
        this.potencia = potencia;
    }
    private static final String marca = "Renault";
    private static String modelo;
    private final double potencia;

    public static String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public double getPotencia(){
        return potencia;
    }

    public static String frenar() {
        return "El vehículo está frenando";
    }

    public String acelerar() {
        return "El vehículo está acelerando";
    }

}
