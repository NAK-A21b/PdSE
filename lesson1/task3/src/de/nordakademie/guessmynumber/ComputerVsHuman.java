package de.nordakademie.guessmynumber;


import de.nordakademie.guessmynumber.payoff.PayPerGuess;
import de.nordakademie.guessmynumber.player.ComputerPlayer;
import de.nordakademie.guessmynumber.player.HumanPlayer;

public class ComputerVsHuman {
	//Diese Methode ist eine Kopie der main Methode aus HumanVsComputer.
	//Die Klassen für Rater und Rätselsteller sind jetzt vertauscht.
	public static void main(String[] args) {
		IPlayer guesser = new ComputerPlayer();
		IPayOffRule register = new PayPerGuess();
		IPlayer chooser= new HumanPlayer();
		GuessMyNumber g = new GuessMyNumber(chooser, guesser, register);
		
		System.out.println("Gewinn von "+guesser.getClass().getSimpleName()+" beläuft sich auf "+g.playRound()+" Taler.");
	}
}
