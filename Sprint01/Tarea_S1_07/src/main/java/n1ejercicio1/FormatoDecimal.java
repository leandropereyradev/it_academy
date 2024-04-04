package n1ejercicio1;

import java.text.DecimalFormat;

public class FormatoDecimal {
    public static String formatoDecimal(double decimal) {
        DecimalFormat df = new DecimalFormat("#.00");

        return  df.format(decimal);
    }
}
