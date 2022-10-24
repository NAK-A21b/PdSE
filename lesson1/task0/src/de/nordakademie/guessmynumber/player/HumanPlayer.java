package de.nordakademie.guessmynumber.player;



import de.nordakademie.guessmynumber.IPlayer;

import java.util.Scanner;

import static de.nordakademie.guessmynumber.GuessMyNumber.*;


public class HumanPlayer implements IPlayer {




	private final Scanner s = new Scanner(System.in);

	@Override
	public int nextNumberToGuess() {
		System.out.println("Welche Zahl soll geraten werden? ");
		return s.nextInt();
	}

	@Override
	public void receiveGuessOfGuesser(int result) {
		System.out.println("Geraten wurde: "+result);
	}

	@Override
	public int guessNumber() {
		System.out.println("Rate meine Zahl:");
		return s.nextInt();
	}

	@Override
	public void receiveResultOfGuess(int result) {
		if (result==GUESS_TO_SMALL) {
			System.out.println("zu klein");;
		}
		if (result==GUESS_TO_LARGE) {
			System.out.println("zu groß");;
		}
		if (result==GUESS_CORRECT) {
			System.out.println("richtig");;
		}	
	}
}
