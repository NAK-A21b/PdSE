package de.nordakademie.guessmynumber;

import de.nordakademie.guessmynumber.payoff.PayPerGuess;
import de.nordakademie.guessmynumber.player.ComputerPlayer;
import de.nordakademie.guessmynumber.player.ComputerPlayer1;
import de.nordakademie.guessmynumber.player.ComputerPlayer2;

public class RunTournament {
    public static void main(String[] args) {
        IPlayer computerPlayer = new ComputerPlayer();
        IPlayer computerPlayer1 = new ComputerPlayer1();
        IPlayer computerPlayer2 = new ComputerPlayer2();
        Tournament tournament = new Tournament(200, new PayPerGuess(), computerPlayer, computerPlayer1, computerPlayer2);
        for (String result : tournament.run()) {
            System.out.println(result);

        }


    }
}
