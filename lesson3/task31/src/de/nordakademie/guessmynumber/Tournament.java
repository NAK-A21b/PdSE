package de.nordakademie.guessmynumber;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private final /* TODO: Das IPlayer Array wird zum IPlayerFactory Array */;
    private final int rounds;
    private final IPayOffRule rule;

    public Tournament(int rounds, IPayOffRule rule, /* TODO: Jetzt werden auch IPlayerFactories iniziert. Definieren Sie den Konstruktor Parameter */) {
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
                                +matchPlayers(/* TODO: Statt Playern Factories übergeben */));
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
            /* TODO: Erzeugen Sie einen chooser aus der ersten Factory */;
            /* TODO: Erzeigen Sie einen Guesser aus der zweiten Factory */;
            result-=new GuessMyNumber(chooser, guesser,rule ).playRound();

            /* TODO: Noch einmal mit vertauschten Rollen */
            result+=new GuessMyNumber(chooser1, guesser1, rule ).playRound();
        }
        return result;
    }
}
