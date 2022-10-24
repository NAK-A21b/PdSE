package de.nordakademie.guessmynumber.player;



import de.nordakademie.guessmynumber.IPlayer;

import java.util.Random;

import static de.nordakademie.guessmynumber.GuessMyNumber.*;


public class ComputerPlayer2 implements IPlayer {

    private final Random r = new Random();

    /* TODO: Fügen sie Exemplarvariablen für die Ober- und Untergrenze des Ratebereichs ein */
	public ComputerPlayer2() {
		super();
/* TODO: Initialisieren Sie die Ober- und Untergrenze des Ratebereichs über die importierten Konstanten aus GuessMyNumber. */
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
		return /* TODO: Geraten wird das arithmetische Mittel der Ober- und Untergrenze. */
	}

	/**
	 * Anpassen der oberen/unteren Grenze an das Ergebnis
	 */
	public void receiveResultOfGuess(int result) {
		if (result==GUESS_TO_LARGE){
			/* TODO: Aktualisieren der Obergrenze. */
		} else if (result==GUESS_TO_SMALL){
			/* TODO: Aktualisieren der Untergrenze. */
		} else {
/* TODO: Initialisieren Sie die Ober- und Untergrenze des Ratebereichs über die importierten Konstanten aus GuessMyNumber.*/
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
