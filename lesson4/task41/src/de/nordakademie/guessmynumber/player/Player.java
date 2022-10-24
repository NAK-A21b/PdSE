package de.nordakademie.guessmynumber.player;

import de.nordakademie.guessmynumber.IChooser;
import de.nordakademie.guessmynumber.IGuesser;
import de.nordakademie.guessmynumber.IPlayer;

public class Player implements IPlayer {
/* TODO */


    public Player(IChooser chooser, IGuesser guesser) {
        this.chooser = chooser;
        this.guesser = guesser;
    }

/* TODO */
}
