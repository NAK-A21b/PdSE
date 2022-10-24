package de.nordakademie.guessmynumber;

import java.util.ArrayList;
import java.util.List;

public class Tournament {

    private final IPlayer[] players;
    private final int rounds;
    private final IPayOffRule rule;

    /**
     * Dieser Konstruktor bekommt die rule die die Player injiziert.
     *
     * @param rounds
     * @param rule
     * @param players
     */
    public Tournament(int rounds, IPayOffRule rule, IPlayer... players) {
        this.players = players;
        this.rounds = rounds;
        this.rule = rule;
    }


    public List<String> run() {
        final List<String> results = new ArrayList<>();
        for (int i = 0; i < players.length; i++) {
            for (int j = i + 1; j < players.length; j++) {
                int result = matchPlayers(players[i], players[j]);
                String pairing = players[i].getClass().getSimpleName() + " vs " + players[j].getClass().getSimpleName();
                results.add(pairing + ": " + result);
            }
        }
        return results;
    }

    /*
    Matches two players
     */
    private int matchPlayers(IPlayer player1, IPlayer player2) {
        GuessMyNumber forward = new GuessMyNumber(player1, player2, rule);
        GuessMyNumber backward = new GuessMyNumber(player2, player1, rule);
        int result = 0;

        for (int k = 0; k < rounds; k++) {
            result += forward.playRound();
            result -= backward.playRound();
        }

        return result;
    }
}
