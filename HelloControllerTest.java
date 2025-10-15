import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloControllerTest {

    @Test
    public void testHello() {
        HelloController controller = new HelloController();
        assertEquals("Hello from simple Java CI/CD!", controller.hello());
    }
}
