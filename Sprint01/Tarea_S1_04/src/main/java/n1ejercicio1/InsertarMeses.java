package n1ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class InsertarMeses {
    private static final List<String> MESES;

    static {
        MESES = new ArrayList<>();
        crearMeses();
    }

    private static void crearMeses() {
        MESES.addAll(List.of("January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"));
    }

    public static List<String> getMeses() {
        return MESES;
    }
}
