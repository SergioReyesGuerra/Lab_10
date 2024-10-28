package pe.edu.tecsup.lab10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // Prueba para el método de resta
    @Test
    void sub() {
        final int EXPECTED = 1;
        Calculator app = new Calculator();
        int actual = app.sub(4, 3);
        assertEquals(EXPECTED, actual);
    }

    // Prueba para el método de suma
    @Test
    void add() {
        final int EXPECTED = 7;
        Calculator app = new Calculator();
        int actual = app.add(4, 3);
        assertEquals(EXPECTED, actual);
    }
}
