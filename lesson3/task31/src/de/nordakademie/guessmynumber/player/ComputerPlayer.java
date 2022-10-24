package de.nordakademie.guessmynumber.player;



import de.nordakademie.guessmynumber.IPlayer;

import java.util.Random;

import static de.nordakademie.guessmynumber.GuessMyNumber.LOWER_LIMIT;
import static de.nordakademie.guessmynumber.GuessMyNumber.UPPER_LIMIT;


public class ComputerPlayer implements IPlayer {

    private final Random r = new Random();
	public ComputerPlayer() {
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
	 * 50 ist doch so gut wie jede andere Zahl.
	 * Bloß nicht kreativ werden.
	 * Wir sind doch keine Künstler.
	 **/
	public int nextNumberToGuess() {
		return 50;
	}


	/**
	 * Dumm ist der, der Dummes tut. Wir machen nichts, also auch nichts Dummes.
	 * Die Ratestrategie des Anderen durchschauen wir sowieso nicht.
	 */
	public void receiveGuessOfGuesser(int guessOfGuesser) {
	}




}
