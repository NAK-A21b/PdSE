package de.nordakademie.guessmynumber.player;

import de.nordakademie.guessmynumber.GuessMyNumber;
import de.nordakademie.guessmynumber.IGuesser;

public class SystematicGuesser implements IGuesser {
    int upper;
    int lower;

    public SystematicGuesser() {
        initBounds();
    }

    void initBounds() {
        upper = GuessMyNumber.UPPER_LIMIT;
        lower = GuessMyNumber.LOWER_LIMIT;
    }

    /**
     * Mitte der oberen und unteren Grenze
     */
 /* TODO */
    /**
     * Anpassen der oberen/unteren Grenze an das Ergebnis
     */
 /* TODO */
}