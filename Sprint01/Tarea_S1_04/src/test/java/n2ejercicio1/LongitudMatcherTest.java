package n2ejercicio1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongitudMatcherTest {

    @Test
    @DisplayName("Debería coincidir la longitud de la palabra.")
    public void testLongitudString() {
        String cadena = "Mordor";
        assertThat(cadena, LongitudMatcher.tieneLongitud(is(6)));
    }

}
