package n1ejercicio1;

public class NoGenericMethods {
    public NoGenericMethods(Object[] objetos) {
        setObjetos(objetos);
    }

    private Object[] objetos = new Object[3];

    public void setObjetos(Object[] objetos) {
        for (int i = 0; i < objetos.length && i < this.objetos.length; i++) {
            this.objetos[i] = objetos[i];
        }
    }

    public Object[] getObjetos() {
        return objetos;
    }
}
