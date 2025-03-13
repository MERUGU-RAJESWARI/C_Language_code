import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {
    private final AddTwoNumbers obj = new AddTwoNumbers();

    @Test
    void testAddition() {
        assertEquals(30, obj.add(10, 20), "10 + 20 should be 30");
    }
}
