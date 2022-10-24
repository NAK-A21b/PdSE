package de.nordakademie.guessmynumber;

import de.nordakademie.guessmynumber.payoff.PayPerGuess;
import de.nordakademie.guessmynumber.player.ComputerPlayer1Factory;
import de.nordakademie.guessmynumber.player.ComputerPlayer2Factory;
import de.nordakademie.guessmynumber.player.ComputerPlayerFactory;

public class RunTournament {
    public static void main(String[] args) {
        for (String result : new Tournament(200, new PayPerGuess(),
                /* TODO: Übergeben Sie drei Factories statt drei Spieler */).run()) {
            System.out.println(result);
        }

    }
}
