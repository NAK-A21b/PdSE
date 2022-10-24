
package de.nordakademie.guessmynumber;


import de.nordakademie.guessmynumber.payoff.PayPerGuess;
import de.nordakademie.guessmynumber.player.ComputerPlayer;
import de.nordakademie.guessmynumber.player.HumanPlayer;

public class HumanVsComputer {
	public static void main(String[] args) {
		IPlayer guesser = new HumanPlayer();
		IPayOffRule payOffRule = new PayPerGuess();
		IPlayer chooser= new ComputerPlayer();
		GuessMyNumber g = new GuessMyNumber(chooser, guesser, payOffRule);
		
		System.out.println("Gewinn von "+guesser.getClass().getSimpleName()+" beläuft sich auf "+g.playRound()+" Taler.");
	}
}
