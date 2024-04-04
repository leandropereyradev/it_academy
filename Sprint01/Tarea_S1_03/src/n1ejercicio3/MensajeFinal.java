package n1ejercicio3;

public class MensajeFinal {

    private int puntaje;
    private String nombre;

    public MensajeFinal(int puntaje, String nombre) {
        this.puntaje = puntaje;
        this.nombre = nombre;
    }

    public void getMensaje() {

        if (puntaje == 10) {
            System.out.println("\nExcelente, " + nombre + "! Has acertado a todas las capitales (O.O)!");
            System.out.println("Capitales acertadas: " + puntaje);

        } else if (puntaje < 10 && puntaje >= 6) {
            System.out.println("\nMuy bien, " + nombre + "! Felicidades ^_^ !!");
            System.out.println("Capitales acertadas: " + puntaje);

        } else if (puntaje < 6 && puntaje >= 3) {
            System.out.println("\nMuy bien, " + nombre + "! pero... como vamos con geofrafía U.U?");
            System.out.println("Capitales acertadas: " + puntaje);

        }else {
            System.out.println("\nBueno... bueh, " + nombre + "... Haré como que aquí no ha sucedido nada -.-");
            System.out.println("Capitales acertadas: " + puntaje);
        }
    }


}
