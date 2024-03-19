package n2ejercicio3;

public class Aritmetica {
    static float matematicas(String operacion, float a, float b) {
        Operacion operacionRealizada;

        switch (operacion.toLowerCase()) {
            case "suma":
                operacionRealizada = (x, y) -> x + y;
                break;
            case "resta":
                operacionRealizada = (x, y) -> x - y;
                break;
            case "multiplicacion":
                operacionRealizada = (x, y) -> x * y;
                break;
            case "division":
                operacionRealizada = (x, y) -> x / y;
                break;
            default:
                throw new IllegalArgumentException("Operación no válida: " + operacion);
        }

        return operacionRealizada.operacion(a, b);

    }
}
