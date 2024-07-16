import org.example.Main;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProgramTest {

    @Test
    public void TestSomar() {
        int result = Main.somar(10, 10);
        assertEquals(20, result);
    }
}
