package de.nordakademie.guessmynumber.player;


import de.nordakademie.guessmynumber.GuessMyNumber;
import de.nordakademie.guessmynumber.IPlayer;

import static de.nordakademie.guessmynumber.GuessMyNumber.LOWER_LIMIT;
import static de.nordakademie.guessmynumber.GuessMyNumber.UPPER_LIMIT;


public class ComputerPlayer2 implements IPlayer {

    private int upper = UPPER_LIMIT;
    private int lower = LOWER_LIMIT;

    public ComputerPlayer2() {
        super();
    }


    /* **************************************************************
     *  Methoden der Ratestrategie                                  *
     ************************************************************** */

    /**
     * Mitte der oberen und unteren Grenze
     */
    public int guessNumber() {
        return (upper + lower) / 2;
    }

    /**
     * Anpassen der oberen/unteren Grenze an das Ergebnis
     */
    public void receiveResultOfGuess(int result) {
        if (result == GuessMyNumber.GUESS_TO_LARGE) {
            upper = (upper + lower) / 2 - 1;
        } else if (result == GuessMyNumber.GUESS_TO_SMALL) {
            lower = (upper + lower) / 2 + 1;
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


    /**
     * Dumm ist der, der Dummes tut. Wir machen nichts, also auch nichts Dummes.
     * Die Ratestrategie des Anderen durchschauen wir sowieso nicht.
     */
    public void receiveGuessOfGuesser(int guessOfGuesser) {
    }


}
