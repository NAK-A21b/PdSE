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
        Tournament tournament = new Tournament(200, new PayPerGuess(),
                /* TODO: Lassen Sie den ComputerPlayer, den ComputerPlayer1 und den ComputerPayer2 gegeneinander antreten. Das Varargs Feature erlaubt es die drei Parameter einfach per Komma zu trennen. */);
        for (String result : tournament.run()) {
            System.out.println(result);

        }


    }
}
