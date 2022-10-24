package de.nordakademie.guessmynumber;

import de.nordakademie.guessmynumber.payoff.PayPerGuess;
import de.nordakademie.guessmynumber.player.*;

public class RunTournament {
    public static void main(String[] args) {
        for (String result : new Tournament(200, new PayPerGuess(),
                /* TODO */).run()) {
            System.out.println(result);
        }

    }
}
