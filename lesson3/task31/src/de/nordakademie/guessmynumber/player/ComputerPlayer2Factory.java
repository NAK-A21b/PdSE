package de.nordakademie.guessmynumber.player;

import de.nordakademie.guessmynumber.IPlayer;
import de.nordakademie.guessmynumber.IPlayerFactory;

/**
 * @author=zimmer
 */
public class ComputerPlayer2Factory implements IPlayerFactory {
    @Override
    public ComputerPlayer2 create() {
        return new ComputerPlayer2();
    }
}
