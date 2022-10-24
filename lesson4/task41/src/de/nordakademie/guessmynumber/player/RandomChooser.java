package de.nordakademie.guessmynumber.player;

import de.nordakademie.guessmynumber.IChooser;

import java.util.Random;

import static de.nordakademie.guessmynumber.GuessMyNumber.LOWER_LIMIT;
import static de.nordakademie.guessmynumber.GuessMyNumber.UPPER_LIMIT;

public class RandomChooser implements IChooser {
    private final Random r = new Random();

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