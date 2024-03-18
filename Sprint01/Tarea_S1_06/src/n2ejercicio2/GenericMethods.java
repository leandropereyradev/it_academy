package n2ejercicio2;

public class GenericMethods {
    public static <T> void imprimirObjetos(T ... indefinida) {

        Object[] genericos = indefinida;

        for (Object elemento : genericos) {
            System.out.println("El objeto es de tipo "
                    + elemento.getClass().getName()
                    + ", y su valor es: " + elemento);
        }
    }

}
