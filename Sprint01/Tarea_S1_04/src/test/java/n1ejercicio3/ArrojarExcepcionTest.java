package n1ejercicio3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrojarExcepcionTest {

    @Test
    @DisplayName("Debería lanzar una excepción ArrayIndexOutOfBoundsException")
    public void testExcepcion(){
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArrojarExcepcion.arrojarExcepcion());
    }
}
