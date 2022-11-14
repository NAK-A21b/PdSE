package de.nordakademie.guessmynumber.player;

import de.nordakademie.guessmynumber.IPlayerFactory;


public class ComputerPlayer1Factory implements IPlayerFactory {
    @Override
    public ComputerPlayer1 create() {
        return new ComputerPlayer1();
    }

}
