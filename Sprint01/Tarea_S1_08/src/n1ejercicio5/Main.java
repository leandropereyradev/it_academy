package n1ejercicio5;

@FunctionalInterface
interface getPiValue {
    double getPi();
}

public class Main {
    public static void main(String[] args) {
        getPiValue resultado = () -> 3.1415;

        System.out.println(resultado.getPi());
    }
}
