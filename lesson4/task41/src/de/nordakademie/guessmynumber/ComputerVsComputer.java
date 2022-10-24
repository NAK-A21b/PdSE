package de.nordakademie.guessmynumber;


import de.nordakademie.guessmynumber.payoff.PayPerGuess;
import de.nordakademie.guessmynumber.player.ConstantChooser;
import de.nordakademie.guessmynumber.player.RandomGuesser;


public class ComputerVsComputer {
	//Diese Methode ist eine Kopie der main Methode aus HumanVsComputer.
	//Rater und Rätselsteller sind jetzt Computer.

	public static void main(String[] args) {
		IPayOffRule register = new PayPerGuess();
		GuessMyNumber g = new GuessMyNumber(new ConstantChooser(), new RandomGuesser(), register);
		
		System.out.println("Gewinn von StupidGuesser beläuft sich auf "+g.playRound()+" Taler.");
	}
}
