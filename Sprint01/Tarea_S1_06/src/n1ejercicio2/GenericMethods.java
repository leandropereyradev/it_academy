package n1ejercicio2;

public class GenericMethods {
    public static <T> void imprimirObjetos(T[] array) {
        for (T elemento : array) {
            System.out.println("El objeto es de tipo "
                    + elemento.getClass().getName()
                    + ", y su valor es: " + elemento);
        }
    }

}
