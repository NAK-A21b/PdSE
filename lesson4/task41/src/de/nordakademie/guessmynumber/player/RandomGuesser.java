package de.nordakademie.guessmynumber.player;

import de.nordakademie.guessmynumber.IGuesser;

import java.util.Random;

import static de.nordakademie.guessmynumber.GuessMyNumber.LOWER_LIMIT;
import static de.nordakademie.guessmynumber.GuessMyNumber.UPPER_LIMIT;

public class RandomGuesser implements IGuesser {
    private final Random r = new Random();

    public int guessNumber() {
        /* TODO */
    }

    public void receiveResultOfGuess(int guessOfGuesser) {
    }
}