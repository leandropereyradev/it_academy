package n2ejercicio1;

public class GenericMethods {
    public static <T> void imprimirObjetos(T obj1, T obj2, Persona obj3) {

        Object[] genericos = {obj1, obj2, obj3};

        for (Object elemento : genericos) {
            System.out.println("El objeto es de tipo "
                    + elemento.getClass().getName()
                    + ", y su valor es: " + elemento);
        }
    }

}
