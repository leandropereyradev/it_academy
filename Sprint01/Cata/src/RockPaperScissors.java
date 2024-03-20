import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Jugador 1:");
        String jugador1 = entrada.nextLine();

        System.out.println("Jugador 2:");
        String jugador2 = entrada.nextLine();

        game(jugador1, jugador2);
    }

    static void game(String pl1, String pl2) {
        String respuesta = pl1.toLowerCase() + pl2.toLowerCase();

        String resultado = switch (respuesta) {
            case "tijeratijera" -> "Empate";
            case "tijerapiedra" -> "Jugador 2 ha ganado";
            case "tijerapapel" -> "Jugador 1 ha ganado!";
            case "papelpapel" -> "Empate";
            case "papeltijera" -> "Jugador 2 ha ganado";
            case "papelpiedra" -> "Jugador 1 ha ganado!";
            case "piedrapiedra" -> "Empate";
            case "piedratijera" -> "Jugador 1 ha ganado!";
            case "piedrapapel" -> "Jugador 2 ha ganado";
            default -> "Opción incorrecta";
        };

        System.out.println("Resultado: " + resultado);
    }
}
