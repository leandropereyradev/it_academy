package n1ejercicio1;

public class NoGenericMethods {

    private final Coche[] OBJETOS = new Coche[3];

    public NoGenericMethods(Coche[] objetos) {
        setObjetos(objetos);
    }

    public void setObjetos(Coche[] objetos) {
        for (int i = 0; i < objetos.length && i < this.OBJETOS.length; i++) {
            this.OBJETOS[i] = objetos[i];
        }
    }

    public Coche[] getObjetos() {
        return OBJETOS;
    }
}
