package de.nordakademie.guessmynumber;


import de.nordakademie.guessmynumber.payoff.PayPerGuess;
import de.nordakademie.guessmynumber.player.ConstantChooser;
import de.nordakademie.guessmynumber.player.HumanGuesser;

public class HumanVsComputer {
	public static void main(String[] args) {
		IPayOffRule payOffRule = new PayPerGuess();
		GuessMyNumber g = new GuessMyNumber(new ConstantChooser(), new HumanGuesser(), payOffRule);
		
		System.out.println("Gewinn von StupidGuesser beläuft sich auf "+g.playRound()+" Taler.");
	}
}
