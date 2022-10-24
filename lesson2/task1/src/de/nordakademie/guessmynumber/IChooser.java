package de.nordakademie.guessmynumber;

public interface IChooser {
    /**
     * Ausdenken einer neuen Zahl
     * @return die zu ratende Zahl
     */
    int nextNumberToGuess();

    /**
     * Nach jedem Rateversuch erhalten wir Informationen über das Raten.
     * @param guessOfGuesser
     */
    default void receiveGuessOfGuesser(int guessOfGuesser){};
}
