
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }
}

public class Exercise7 {

    Calculator c = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, c.add(2, 3));
    }
}
