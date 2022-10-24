package de.nordakademie.guessmynumber;


import de.nordakademie.guessmynumber.payoff.PayPerGuess;
import de.nordakademie.guessmynumber.player.ComputerPlayer;
import de.nordakademie.guessmynumber.player.HumanPlayer;

public class ComputerVsHuman {
	//Diese Methode ist eine Kopie der main Methode aus HumanVsComputer.
	//Die Klassen für Rater und Rätselsteller sind jetzt vertauscht.
	public static void main(String[] args) {
		IPlayer guesser = new /* TODO */Player();
		IPayOffRule register = new PayPerGuess();
		IPlayer chooser= new /* TODO */Player();
		GuessMyNumber g = new GuessMyNumber(chooser, guesser, register);

		int result = g.playRound();
		System.out.println("Gewinn von "+guesser.getClass().getSimpleName()+" beläuft sich auf "+ result +" Taler.");
	}
}
