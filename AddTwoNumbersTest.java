import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {
    private final AddTwoNumbers obj = new AddTwoNumbers();

    @Test
    void testAddition() {
        assertEquals(30, obj.add(10, 20), "10 + 20 should be 30");
        assertEquals(0, obj.add(0, 0), "0 + 0 should be 0");
        assertEquals(-10, obj.add(-5, -5), "-5 + (-5) should be -10");
        assertEquals(5, obj.add(10, -5), "10 + (-5) should be 5");
    }
}
