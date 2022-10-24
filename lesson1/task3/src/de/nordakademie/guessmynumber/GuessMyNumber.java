package de.nordakademie.guessmynumber;


import java.util.Vector;


public class  GuessMyNumber {

	public static final int LOWER_LIMIT = 0;
	public static final int UPPER_LIMIT = 99;
	public static final int GUESS_CORRECT = 0;
	public static final int GUESS_TO_SMALL = -1;
	public static final int GUESS_TO_LARGE = 1;


	private final IChooser chooser;
	private final IGuesser guesser;
	private final IPayOffRule payOffRule;

	public GuessMyNumber(IChooser chooser, IGuesser guesser, IPayOffRule rule) {
		super();
		this.chooser = chooser;
		this.guesser = guesser;
		this.payOffRule = rule;
	}

	/**
	 * Methode führt ein Spiel aus. Diese Methode kann mehrmals hintereinander aufgerufen werden.
	 * Die Spieler chooser und guesser sind selbst verantwortlich, nach beenden des Spiels
	 * Ihren internen Status zurück zu setzen.
	 * @return
	 */
	public int playRound() {
		//Die resultList enthält die zu ratende Zahl und alle Rateversuche.
		//Verwende die List Implementation Vector, weil die Methoden firstElement und lastElement hat.
		//first Element ist die zu ratende Zahl und lastElement die letzte geratene.
		Vector<Integer> resultList = new Vector<>();
		resultList.add(chooser.nextNumberToGuess());
		int result;
		do {
			resultList.add(guesser.guessNumber());
			chooser.receiveGuessOfGuesser(resultList.lastElement());
			guesser.receiveResultOfGuess(result=evaluateGuess(resultList));
		} while (result != GUESS_CORRECT);
		return payOffRule.computePayOff(resultList);
	}

	private int evaluateGuess(Vector<Integer> resultList) {
		if (resultList.firstElement() < (int)resultList.lastElement())
			return GUESS_TO_LARGE;
		if (resultList.firstElement() > resultList.lastElement())
			return GUESS_TO_SMALL;
		return GUESS_CORRECT;
	}
}
