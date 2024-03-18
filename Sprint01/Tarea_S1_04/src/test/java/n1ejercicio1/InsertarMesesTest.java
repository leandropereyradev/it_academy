package n1ejercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class InsertarMesesTest {
    List<String> meses = new ArrayList<>();

    @BeforeEach
    public void iniciar(){
        meses.addAll(InsertarMeses.getMeses());
    }

    @Test
    @DisplayName("El Array debería tener 12 posiciones")
    public void testLongitud() {
        Assertions.assertEquals(12, meses.size());
    }

    @Test
    @DisplayName("'August' se debería encontrar en la posición 8 del Array")
    public void testUbicacionMesAgosto() {
        Assertions.assertEquals("August", meses.get(7));
    }

    @Test
    @DisplayName("El Array no debería ser 'null'")
    public void testListaNotNull() {
        Assertions.assertNotNull(meses);
    }

}