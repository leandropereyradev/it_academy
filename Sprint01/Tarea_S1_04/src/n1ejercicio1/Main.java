package n1ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> meses = new ArrayList<>(InsertarMeses.getMeses());

        System.out.println(meses);
    }
}
