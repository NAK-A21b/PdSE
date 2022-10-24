package de.nordakademie.guessmynumber.player;



import de.nordakademie.guessmynumber.IPlayer;

import java.util.Random;

import static de.nordakademie.guessmynumber.GuessMyNumber.LOWER_LIMIT;
import static de.nordakademie.guessmynumber.GuessMyNumber.UPPER_LIMIT;


public class ComputerPlayer1 implements IPlayer {

    private final Random r = new Random();
	public ComputerPlayer1() {
		super();
	}


	/* **************************************************************
	 *  Methoden der Ratestrategie                                  *
	 ************************************************************** */

	/**
	 * Blindes drauf losraten zwischen LOWER_LIMIT und UPPER_LIMIT. 
	 * Der dümmste Bauer hat die dicksten Kartoffeln.
	 * Ausserdem spielen doch Millionen Menschen jede Woche Lotto.
	 * Warum sollte das nicht klappen?
	 */
	public int guessNumber() {
		return r.nextInt(UPPER_LIMIT-LOWER_LIMIT+1);
	}

	/**
	 * Dumm ist der, der Dummes tut. Wir machen nichts, also auch nichts Dummes.
	 * Was kümmert uns das Ergebnis des letzten Rateversuchs.
	 * Liegt sowieso in der Vergangenheit.
	 */
	public void receiveResultOfGuess(int result) {
	}

	/* **************************************************************
	 *  Methoden fürs Zahlen Ausdenken                              *
	 ************************************************************** */


	/**
	 * Eine zufällige Zahl auswählen ist besser.
	 * Kopieren des Codes aus guessNumber.
	 * Wenn ich auch sonst ein Anhänger des DRY Mantras bin, rufe ich hier nicht guessNumber auf.
	 * Es handelt sich um unterschiedliche Business Logik Bestandteile, die nicht zusammmen
	 * gefasst werden sollten. Nur zufällig wird derselbe Code verwendet.
	 **/
	public int nextNumberToGuess() {
		return r.nextInt(UPPER_LIMIT-LOWER_LIMIT+1);
	}

}
