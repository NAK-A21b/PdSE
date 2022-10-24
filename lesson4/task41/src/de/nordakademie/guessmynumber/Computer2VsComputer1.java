package de.nordakademie.guessmynumber;


import de.nordakademie.guessmynumber.payoff.PayPerGuess;
import de.nordakademie.guessmynumber.player.RandomChooser;
import de.nordakademie.guessmynumber.player.SystematicGuesser;

public class Computer2VsComputer1 {
	public static void main(String[] args) {
		IPayOffRule payOffRule = new PayPerGuess();
		GuessMyNumber g = new GuessMyNumber(new RandomChooser(), new SystematicGuesser(), payOffRule);
		
		System.out.println("Gewinn von SystematicGuesser beläuft sich auf "+g.playRound()+" Taler.");
	}
}
