package n1ejercicio3;

public class CheckRespuesta {

    private String respuesta;
    private String capital;
    private int oportunidades;
    private int puntaje;

    public CheckRespuesta(String respuesta, String capital, int oportunidades, int puntaje) {
        this.respuesta = respuesta;
        this.capital = capital;
        this.oportunidades = oportunidades;
        this.puntaje = puntaje;
    }

    public void getCheckRespuesta() {
        if (respuesta.equalsIgnoreCase(capital)) {

            if (oportunidades > 0) {
                System.out.println("Correcto! Vamos por otra más!");
            } else {

                System.out.println("Correcto!");
            }

            puntaje ++;

        } else {

            if (oportunidades > 0){
                System.out.println(
                        "No! La capital es "
                                + capital + ". Aún te quedan "
                                + oportunidades + " oportunidades más!");
            } else {

                System.out.println("No! La capital es " + capital + ". Gracias por jugar!");
            }
        }

    }

    public int getPuntaje() {
        return puntaje;
    }


}
