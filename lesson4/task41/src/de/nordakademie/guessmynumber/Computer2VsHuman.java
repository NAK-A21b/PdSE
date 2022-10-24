package de.nordakademie.guessmynumber;


import de.nordakademie.guessmynumber.payoff.PayPerGuess;
import de.nordakademie.guessmynumber.player.HumanChooser;
import de.nordakademie.guessmynumber.player.RandomGuesser;

public class Computer2VsHuman {
	public static void main(String[] args) {
		IPayOffRule payOffRule = new PayPerGuess();
		GuessMyNumber g = new GuessMyNumber(new HumanChooser(), new RandomGuesser(), payOffRule);

		System.out.println("Gewinn von StupidGuesser beläuft sich auf "+g.playRound()+" Taler.");
	}
}
