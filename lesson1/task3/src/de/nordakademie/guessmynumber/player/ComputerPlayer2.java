package de.nordakademie.guessmynumber.player;


import de.nordakademie.guessmynumber.IPlayer;

import static de.nordakademie.guessmynumber.GuessMyNumber.*;


public class ComputerPlayer2 implements IPlayer {

	private int upper;
	private int lower;

	public ComputerPlayer2() {
		initBounds();
	}

	private void initBounds() {
		upper=UPPER_LIMIT;
		lower=LOWER_LIMIT;
	}


	/* **************************************************************
	 *  Methoden der Ratestrategie                                  *
	 ************************************************************** */

	/**
	 * Mitte der oberen und unteren Grenze
	 */
	public int guessNumber() {
		return (lower + upper) / 2;
	}

	/**
	 * Anpassen der oberen/unteren Grenze an das Ergebnis
	 */
	public void receiveResultOfGuess(int result) {
		if (result==GUESS_TO_LARGE){
			upper = guessNumber() - 1;
		} else if (result==GUESS_TO_SMALL){
			lower = guessNumber() + 1;
		} else {
			lower = LOWER_LIMIT;
			upper = UPPER_LIMIT;
		}
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

}
