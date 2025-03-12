import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    public int add(int a, int b) {
        return a + b;
    }

    @Test
    void testAddition() {
        assertEquals(30, add(10, 20), "10 + 20 should be 30");
        assertEquals(0, add(0, 0), "0 + 0 should be 0");
        assertEquals(-10, add(-5, -5), "-5 + (-5) should be -10");
        assertEquals(5, add(10, -5), "10 + (-5) should be 5");
    }
}
