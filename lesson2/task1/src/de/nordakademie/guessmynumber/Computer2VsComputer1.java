package de.nordakademie.guessmynumber;


import de.nordakademie.guessmynumber.payoff.PayPerGuess;
import de.nordakademie.guessmynumber.player.ComputerPlayer1;
import de.nordakademie.guessmynumber.player.ComputerPlayer2;

public class Computer2VsComputer1 {
	public static void main(String[] args) {
		IPlayer guesser = new ComputerPlayer2();
		IPayOffRule payOffRule = new PayPerGuess();
		IPlayer chooser= new ComputerPlayer1();
		GuessMyNumber g = new GuessMyNumber(chooser, guesser, payOffRule);
		
		System.out.println("Gewinn von "+guesser.getClass().getSimpleName()+" beläuft sich auf "+g.playRound()+" Taler.");
	}
}
