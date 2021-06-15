import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAddition {
    @Test
    public static void main(String[] args) {
        Addition x = new Addition(1,2);
        assertEquals(x.sum(),3);
    }
}
