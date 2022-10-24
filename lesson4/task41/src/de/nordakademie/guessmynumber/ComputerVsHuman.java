package de.nordakademie.guessmynumber;


import de.nordakademie.guessmynumber.payoff.PayPerGuess;
import de.nordakademie.guessmynumber.player.HumanChooser;
import de.nordakademie.guessmynumber.player.RandomGuesser;

public class ComputerVsHuman {
	//Diese Methode ist eine Kopie der main Methode aus HumanVsComputer.
	//Die Klassen für Rater und Rätselsteller sind jetzt vertauscht.
	public static void main(String[] args) {
		IPayOffRule register = new PayPerGuess();
		GuessMyNumber g = new GuessMyNumber(new HumanChooser(), new RandomGuesser(), register);
		
		System.out.println("Gewinn von StupidGuesser beläuft sich auf "+g.playRound()+" Taler.");
	}
}
