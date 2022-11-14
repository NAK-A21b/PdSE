package de.nordakademie.guessmynumber.player;

import de.nordakademie.guessmynumber.IPlayerFactory;


public class ComputerPlayerFactory implements IPlayerFactory {
    @Override
    public ComputerPlayer create() {
        return new ComputerPlayer();
    }

}
