import static org.junit.Assert.*;

import de.nordakademie.guessmynumber.IPlayer;
import de.nordakademie.guessmynumber.player.ComputerPlayer1;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Tests {
  @Test
  public void testSolution() {
    IPlayer out = new ComputerPlayer1();
    //So testet man nicht zufallsabhängige Methoden, aber Random soll jetzt nicht injeziert werden
    Set<Integer> results = new HashSet<>();
    for (int i=0; i<10000;i++){
      results.add(out.nextNumberToGuess());
    };
    assertTrue("Zu ratende Zahl ist immer dieselbe. ",results.size()>1);
    assertTrue("99 sollte vorkommen. ",results.contains(99));
    assertTrue("0 sollte vorkommen. ",results.contains(0));
  }
}