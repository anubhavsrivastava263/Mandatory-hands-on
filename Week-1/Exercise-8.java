
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise8 {

    @Test
    void testAssertions() {

        assertEquals(10, 5 + 5);

        assertTrue(20 > 10);

        assertFalse(2 > 5);

        assertNull(null);

        assertNotNull(new Object());
    }
}
