package n1ejercicio5;

public class Main {
    public static void main(String[] args) {
        GetPiValue resultado = () -> 3.1415;

        System.out.println(resultado.getPi());
    }
}
