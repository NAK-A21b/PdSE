import static org.junit.Assert.*;

import de.nordakademie.guessmynumber.IPayOffRule;
import de.nordakademie.guessmynumber.IPlayer;
import de.nordakademie.guessmynumber.Tournament;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;

public class TestTournament {
  private static class SimplePlayer implements IPlayer{
    private int guesses=0, chooses=0;
    public int nextNumberToGuess() { chooses++; return 0; }
    public void receiveGuessOfGuesser(int guessOfGuesser) { }
    public int guessNumber() {
      guesses++; return 0; }
    public void receiveResultOfGuess(int result) { }
  }
  private static class SimplePayoff implements IPayOffRule{
    public int computePayOff(List<Integer> resultList) { return 1; }
  }

  @Test
  public void testSolution() {
    SimplePlayer p1 = new SimplePlayer();
    SimplePlayer p2 = new SimplePlayer();
    IPayOffRule r = new SimplePayoff();
    final int rounds = 2;
    Tournament out = new Tournament(rounds,r,p1,p2);
    List<String> s= out.run();
    assertEquals(1,s.size());
    assertTrue("Werden die runden richtig verrechnet?", s.get(0).endsWith(" 0"));
    assertEquals("Erster Spieler 1 rät nicht.", rounds,p1.guesses);
    assertEquals("Erster Spieler 1 wählt nicht.", rounds,p1.chooses);
    assertEquals("Erster Spieler 2 rät nicht.", rounds,p2.guesses);
    assertEquals("Erster Spieler 2 wählt nicht.", rounds,p2.chooses);
  }
  @Test
  public void testPrivate(){

    for (Field f: Tournament.class.getDeclaredFields()){
      assertTrue("Variable nicht private. "+f.getName()+" sollte private sein.",(f.getModifiers()& Modifier.PRIVATE)!=0);
    }
  }
}