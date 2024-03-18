package n1ejercicio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculoDniTest {

    @ParameterizedTest
    @DisplayName("La letra debería corresponder al numero de DNI dado por Parametrización")
    @CsvSource({
            // CsvSource divide por comas que luego se reparten en los parámetros del test.
            // Primer parámetro es la clave = numDni
            // Segundo parámetro es el valor = letraEsperada
            "17818880,K",
            "13658981,V",
            "85670331,T",
            "56008527,P",
            "49720604,D",
            "31531257,M",
            "47394013,Y",
            "91240607,K",
            "23399802,Q",
            "76994945,F"
    })
    public void testLetraDni(int numDni, String letraEsperada) {
        String letraCalculada = CalculoDni.getLetra(numDni);
        Assertions.assertEquals(letraEsperada, letraCalculada);
    }
}
