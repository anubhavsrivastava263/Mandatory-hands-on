
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }
}

public class Exercise9 {

    Calculator c;

    @BeforeEach
    void setup() {
        c = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Completed");
    }

    @Test
    void testAdd() {

        int result = c.add(5, 3);

        assertEquals(8, result);
    }
}
