import static de.nordakademie.guessmynumber.GuessMyNumber.*;
import static org.junit.Assert.*;

import de.nordakademie.guessmynumber.IGuesser;
import de.nordakademie.guessmynumber.IPlayer;
import de.nordakademie.guessmynumber.player.ComputerPlayer2;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Tests {
  IPlayer out = new ComputerPlayer2();
  public static final String ARITHMETISCHES_MITTEL_RATEN = "Überprüfen Sie, ob Sie das arithmetische Mittel der aktellen Ober- und Untergrenze raten. \n";
  public static final String MIT_49_ZU_RATEN_ANFANGEN = "Computer2 sollte mit 49 zu raten anfangen.";
  public static final String OBER_UND_UNTERGRENZEN_RICHTIG_AKTUALISIERT = "Haben Sie die aktuellen Ober- und Untergrenzen richtig aktualisiert?\n";
  public static final String UNTERGRENZE_EINS_HOEHER = "TO_SMALL heißt auch, dass die Untergrenze eins höher gesetzt werden kann.";
  public static final String OBERGRENZE_EINS_NIEDRIGER = "TO_LARGE bedeutet auch, dass die Obergrenze eins niedriger gesetzt werden kann.";
  public static final String INITIALWERTE_WIEDERHERGESTELLEN = "Nach einem richtig geratenen Versuch, sollen für ein weiters Spiel die Initialwerte wieder hergestellt werden.";
  public static final String RICHTIG_INITIALISIERT = "Ist der Ratebereich richtig initialisiert?\n";

  @Test
  public void testSolution() {


    assertEquals(RICHTIG_INITIALISIERT +ARITHMETISCHES_MITTEL_RATEN + MIT_49_ZU_RATEN_ANFANGEN, 49, out.guessNumber());
    out.receiveResultOfGuess(GUESS_TO_SMALL);
    assertEquals( OBER_UND_UNTERGRENZEN_RICHTIG_AKTUALISIERT + UNTERGRENZE_EINS_HOEHER,74, out.guessNumber());
    out.receiveResultOfGuess(GUESS_TO_LARGE);
    assertEquals(OBER_UND_UNTERGRENZEN_RICHTIG_AKTUALISIERT+ OBERGRENZE_EINS_NIEDRIGER,61, out.guessNumber());
    out.receiveResultOfGuess(GUESS_CORRECT);
    assertEquals(INITIALWERTE_WIEDERHERGESTELLEN,49, out.guessNumber());
  }

  @Test
  public void testPrivate(){
    for (Field f: out.getClass().getDeclaredFields()){
      assertTrue("Variable "+f.getName()+" sollte private sein.",(f.getModifiers()& Modifier.PRIVATE)!=0);
    }
  }
}