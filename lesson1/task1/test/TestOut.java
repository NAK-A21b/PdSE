import de.nordakademie.guessmynumber.ComputerVsHuman;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestOut {
    @Test
    public void testSolution()  {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        System.out.close();
        System.setOut(out);
        System.setIn(new ByteArrayInputStream("50\n".getBytes()));
        ComputerVsHuman.main(null);
        String response=baos.toString();
        assertTrue(response.contains("Welche Zahl soll geraten werden?"));
        assertTrue(response.contains("ComputerPlayer"));
    }
}