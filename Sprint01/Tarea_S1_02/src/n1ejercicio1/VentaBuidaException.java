package n1ejercicio1;

public class VentaBuidaException extends Exception {

    private String msg;

    public VentaBuidaException(String msg) {
        super(msg);

        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}
