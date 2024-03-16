package n2ejercicio1;

interface Camara {
    void fotografiar();
}

interface Reloj {
    void alarma();
}

public class Telefono {

    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    private String marca;
    private String modelo;

    public void llamar(String numero) {
        System.out.println("Llamando al " + numero);
    }
}
