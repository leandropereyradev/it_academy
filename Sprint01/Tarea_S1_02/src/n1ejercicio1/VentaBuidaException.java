package n1ejercicio1;

public class VentaBuidaException extends Exception {
    public VentaBuidaException(String msg) {
        super(msg);

        this.msg = msg;
    }

    private String msg;

    public String getMessage() {
        return msg;
    }
}
