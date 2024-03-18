package n1ejercicio2;

public class GenericMethods {
    public static <T> void imprimirObjetos(T obj1, T obj2, T obj3) {

        Object[] genericos = new Object[3];
        genericos[0] = obj1;
        genericos[1] = obj2;
        genericos[2] = obj3;

        for (Object elemento : genericos) {
            System.out.println("El objeto es de tipo "
                    + elemento.getClass().getName()
                    + ", y su valor es: " + elemento);
        }
    }

}
