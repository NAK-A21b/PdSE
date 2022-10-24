package de.nordakademie.guessmynumber.player;



import de.nordakademie.guessmynumber.GuessMyNumber;
import de.nordakademie.guessmynumber.IPlayer;

import java.util.Random;

import static de.nordakademie.guessmynumber.GuessMyNumber.LOWER_LIMIT;
import static de.nordakademie.guessmynumber.GuessMyNumber.UPPER_LIMIT;


public class ComputerPlayer2 implements IPlayer {

    private final Random r = new Random();

    private int upper,lower;
	public ComputerPlayer2() {
		super();
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
		return (upper+lower)/2;
	}

	/**
	 * Anpassen der oberen/unteren Grenze an das Ergebnis
	 */
	public void receiveResultOfGuess(int result) {
		if (result== GuessMyNumber.GUESS_TO_LARGE){
			upper=(upper+lower)/2-1;
		} else if (result== GuessMyNumber.GUESS_TO_SMALL){
			lower=(upper+lower)/2+1;
		} else {
			initBounds();
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
