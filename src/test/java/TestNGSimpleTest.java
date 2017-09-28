import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestNGSimpleTest {
    @Test
    public void testOne(){
        assertEquals("Hello", "Hello");
    }
}
