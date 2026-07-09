
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }
}

public class Exercise10 {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator object created");
    }

    @Test
    void testAdd() {
        assertEquals(8, calculator.add(5, 3));
        System.out.println("Test Executed");
    }

    @AfterEach
    void tearDown() {
        calculator = null;
        System.out.println("TearDown: Resources cleaned");
    }
}
