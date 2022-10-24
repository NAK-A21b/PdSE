package de.nordakademie.guessmynumber.player;

import de.nordakademie.guessmynumber.IChooser;

public class ConstantChooser implements IChooser {
    public ConstantChooser() {
    }

    /**
     * 50 ist doch so gut wie jede andere Zahl.
     * Bloß nicht kreativ werden.
     * Wir sind doch keine Künstler.
     **/
    public int nextNumberToGuess() {
        /* TODO */
    }

    /**
     * Dumm ist der, der Dummes tut. Wir machen nichts, also auch nichts Dummes.
     * Die Ratestrategie des Anderen durchschauen wir sowieso nicht.
     */
    public void receiveGuessOfGuesser(int guessOfGuesser) {
    }
}