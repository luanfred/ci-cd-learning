import org.example.Main;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class ProgramTest {

    @Test
    public void TestSomar() {
        int result = Main.somar(10, 10);
        assertEquals(22, result);
    }
}
