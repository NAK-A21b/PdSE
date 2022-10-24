package de.nordakademie.guessmynumber.player;

import de.nordakademie.guessmynumber.IGuesser;

import java.util.Scanner;

import static de.nordakademie.guessmynumber.GuessMyNumber.GUESS_CORRECT;
import static de.nordakademie.guessmynumber.GuessMyNumber.GUESS_TO_LARGE;

public class HumanGuesser implements IGuesser {
    private Scanner s = new Scanner(System.in);
    @Override
    public int guessNumber() {
/* TODO */
    }

    @Override
    public void receiveResultOfGuess(int result) {
/* TODO */
    }
}
