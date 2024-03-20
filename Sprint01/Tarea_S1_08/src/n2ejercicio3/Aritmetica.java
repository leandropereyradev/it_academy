package n2ejercicio3;

public class Aritmetica {
    static float matematicas(String operacion, float a, float b) {
        Operacion operacionRealizada = switch (operacion.toLowerCase()) {
            case "suma" -> (x, y) -> x + y;
            case "resta" -> (x, y) -> x - y;
            case "multiplicacion" -> (x, y) -> x * y;
            case "division" -> (x, y) -> x / y;
            default -> throw new IllegalArgumentException("Operación no válida: " + operacion);
        };

        return operacionRealizada.operacion(a, b);

    }
}
