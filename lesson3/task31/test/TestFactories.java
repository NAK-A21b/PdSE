import static org.junit.Assert.*;

import de.nordakademie.guessmynumber.ComputerVsHuman;
import de.nordakademie.guessmynumber.RunTournament;
import de.nordakademie.guessmynumber.Tournament;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestFactories {
    @Test
    public void testSolution() {

        for (Field f : Tournament.class.getFields()) {
            assertTrue("Variable " + f.getName() + " sollte private sein.", (f.getModifiers() & Modifier.PRIVATE) != 0);
        }
    }

    @Test
    public void test1(){
        Class<?> c = Tournament.class;
        Tournament out = new Tournament(1,null,null);
        Field[] fields = out.getClass().getDeclaredFields();
        assertEquals("Es werden drei Exemplarvariablen in Tournament erwartet.",3, fields.length);
    }
    @Test
    public void test2(){
        Constructor<?>[] cs=Tournament.class.getConstructors();
        assertEquals("Zu viele Konstruktoren von Tournament",1,cs.length);
    }
    @Test
    public void test3(){
        Constructor<?>[] cs=Tournament.class.getConstructors();
        assertEquals("Der Konstruktor von Tournament soll drei Parameter haben.",3,cs[0].getParameterTypes().length);
        String s=cs[0].getParameterTypes()[2].getTypeName();
        assertTrue("Konstruktor Parameter hat den falschen Typ",s.endsWith("IPlayerFactory[]"));
    }

    @Test
    public void testSolution2(){
        ByteArrayOutputStream out1 = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(out1);
        System.out.close();
        System.setOut(out);
        System.setIn(new ByteArrayInputStream("".getBytes()));
        RunTournament.main(null);
        String response=out1.toString();
        assertTrue("ComputerPlayer sollte mitspielen",response.contains("ComputerPlayer"));
        assertTrue("ComputerPlayer1 sollte mitspielen.",response.contains("ComputerPlayer1"));
    }
}