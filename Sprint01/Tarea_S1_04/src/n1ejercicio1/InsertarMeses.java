package n1ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class InsertarMeses {

    static {
        meses = new ArrayList<>();
        crearMeses();
    }
    private static final List<String> meses;

    private static void crearMeses() {
        meses.addAll(List.of("January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"));
    }

    public static List<String> getMeses() {
        return meses;
    }
}
