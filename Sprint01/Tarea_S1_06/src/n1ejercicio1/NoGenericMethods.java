package n1ejercicio1;

public class NoGenericMethods {
    public NoGenericMethods(Coche[] objetos) {
        setObjetos(objetos);
    }

    private Coche[] objetos = new Coche[3];

    public void setObjetos(Coche[] objetos) {
        for (int i = 0; i < objetos.length && i < this.objetos.length; i++) {
            this.objetos[i] = objetos[i];
        }
    }

    public Coche[] getObjetos() {
        return objetos;
    }
}
