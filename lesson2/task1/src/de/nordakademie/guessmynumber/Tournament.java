package de.nordakademie.guessmynumber;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    /* TODO: Exemplarvariable für alle Spieler des Tournaments. Also ein Array.*/
    private final int rounds;
    private final IPayOffRule rule;

    /**
     * Dieser Konstruktor bekommt die rule die die Player injiziert.
     * @param rounds
     * @param rule
     * @param players
     */
    public Tournament(int rounds, IPayOffRule rule, /* TODO: Der Parameter für Players. Statt eines Spielerarrays mit [] verwenden Sie bitte das Varargs Symbol ...  . Es erlaubt die Übergabe von mehreren Spielern */) {
        this.players = players;
        this.rounds = rounds;
        this.rule=rule;
    }


    public List<String> run(){
        final List<String> results = new ArrayList<String>();
        for (int i = 0; i < players.length; i++) {
            for (int j = /* TODO: Initialisieren Sie j so, dass jeder Sieler spielt gegen jeden anderen einmal matcht. */; j < players.length; j++) {
                int result = /* TODO: Spieler i tritt in einem Match gegen Spieler j an. */;
                String pairing = players[i].getClass().getSimpleName() + " vs " + players[j].getClass().getSimpleName();
                results.add(pairing + ": " + result);
            }
        }
        return results;
    }

    /*
    Matches two players
     */
    private int matchPlayers(IPlayer player1, IPlayer player2){
        int result=0;
        for (int k = 0; k < rounds; k++) {
            /* TODO: Ein Hinspiel. Ergebnis zu result addieren. */;
            /* TODO: Ein Rückspiel. Ergebnis von result subtrahieren. */;
        }
        return result;
    }
}
