package de.nordakademie.guessmynumber;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private final IPlayerFactory[] playerFactories;
    private final int rounds;
    private final IPayOffRule rule;

    public Tournament(int rounds, IPayOffRule rule, IPlayerFactory... playerFactories) {
        this.playerFactories = playerFactories;
        this.rounds = rounds;
        this.rule=rule;
    }


    public List<String> run(){
        final List<String> results = new ArrayList<>();
        for (int i = 0; i < playerFactories.length; i++) {
            for (int j = i+1; j < playerFactories.length; j++) {
                results.add(
                        /* Namen holen */
                        playerFactories[i].create().getClass().getSimpleName()+" vs "+ playerFactories[j].create().getClass().getSimpleName()+": "
                                +matchPlayers(playerFactories[i], playerFactories[j]));
            }
        }
        return results;
    }

    /*
    Matches two players
     */
    private int matchPlayers(IPlayerFactory playerFactory1, IPlayerFactory playerFactory2){
        int result=0;
        for (int k = 0; k < rounds; k++) {
            /* Zwei neue spieler erzeugen */
            result-=new GuessMyNumber(playerFactory1.create(), playerFactory2.create(), rule ).playRound();

            result+=new GuessMyNumber(playerFactory2.create(), playerFactory1.create(), rule ).playRound();
        }
        return result;
    }
}
