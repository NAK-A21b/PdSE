package de.nordakademie.guessmynumber;


import de.nordakademie.guessmynumber.payoff.PayPerGuess;
import de.nordakademie.guessmynumber.player.ComputerPlayer2;
import de.nordakademie.guessmynumber.player.HumanPlayer;

public class Computer2VsHuman {
	public static void main(String[] args) {
		IPlayer guesser = new ComputerPlayer2();
		IPayOffRule payOffRule = new PayPerGuess();
		IPlayer chooser= new HumanPlayer();
		GuessMyNumber g = new GuessMyNumber(chooser, guesser, payOffRule);
		
		System.out.println("Gewinn von "+guesser.getClass().getSimpleName()+" beläuft sich auf "+g.playRound()+" Taler.");
	}
}
