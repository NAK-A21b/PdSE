package de.nordakademie.guessmynumber;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private final IPlayer[] players;
    private final int rounds;
    private final IPayOffRule rule;

    public Tournament(int rounds, IPayOffRule rule, IPlayer ... players) {
        this.players = players;
        this.rounds = rounds;
        this.rule=rule;
    }


    public List<String> run(){
        final List<String> results = new ArrayList<String>();
        for (int i = 0; i < players.length; i++) {
            for (int j = i+1; j < players.length; j++) {
                results.add(
                        players[i]+" vs "+ players[j]+": "
                                +matchPlayers(players[i],players[j]));
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
            result-=new GuessMyNumber(player1,player2,rule ).playRound();
            result+=new GuessMyNumber(player2,player1,rule ).playRound();
        }
        return result;
    }
}
