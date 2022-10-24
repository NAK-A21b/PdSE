package de.nordakademie.guessmynumber;

public interface IGuesser {

    /**
     *   Der Rater rät eine Zahl.
     * @return die geratene Zahl
     */
    int guessNumber();

    /**
     * Der Rater wird nach dem Aufruf von guessNumber über das Ergebnis seiner geratenen Zahl informiert
     * @param result
     *     verwendet die Konstanten GUESS_CORRECT, GUESS_TO_SMALL und GUESS_TO_LARGE
     */
    void receiveResultOfGuess(int result);
}
