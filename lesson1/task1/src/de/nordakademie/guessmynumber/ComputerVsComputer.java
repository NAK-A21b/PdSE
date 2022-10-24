package de.nordakademie.guessmynumber;


import de.nordakademie.guessmynumber.payoff.PayPerGuess;
import de.nordakademie.guessmynumber.player.ComputerPlayer;
import de.nordakademie.guessmynumber.player.HumanPlayer;

public class ComputerVsComputer {
	//Diese Methode ist eine Kopie der main Methode aus HumanVsComputer.
	//Rater und Rätselsteller sind jetzt Computer.

	public static void main(String[] args) {
		IPlayer guesser = new /* TODO */Player();
		IPayOffRule register = new PayPerGuess();
		IPlayer chooser= new /* TODO */Player();
		GuessMyNumber g = new GuessMyNumber(chooser, guesser, register);
		
		System.out.println("Gewinn von "+guesser.getClass().getSimpleName()+" beläuft sich auf "+g.playRound()+" Taler.");
	}
}
