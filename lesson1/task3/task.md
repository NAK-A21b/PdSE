#Aufgabe 2

Das Raten des Computerspielers erfolgt zufällig. 
Beachten Sie folgende Bedingungen im Einsatz eines Spielers.
 - Nach jedem Aufruf von guessNumber() erfolgt ein Aufruf von receiveResultOfGuess. 
   
Das Raten soll nun systematisch erfolgen. Dabei wird nach jedem Raten, der mögliche Zahlenbereich (ungefähr) halbiert.
Das soll wie folgt erfolgen: 

- Der Computerspieler merkt sich eine Ober- und eine Untergrenze eines Ratebereichs.
- Diese werden initial auf 0 und 99 gesetzt. Dafür gibt es Konstanten in der Klasse GuessMyNumber.
- In jedem Rateversuch wird das arithmetische Mittel zwischen den beiden Grenzen geraten.
- Aufgrund der Reaktion (zu klein, zu groß) kann die Unter- bzw. Obergrenze aktualisiert werden.
- Ist die geratene Zahl richtig gewesen, können für eine nächste Raterunde die Grenzen wieder auf den Anfangswert zurückgestellt werden.

#Was soll man tun?
1. Bearbeiten Sie die Klasse ComputerPlayer2 wie in der obigen Liste beschrieben. 
2. Testen Sie die Änderungen durch den Aufruf von Computer2VsHuman.
3. Sie können in Computer2VsComputer1 auch zwei Computerspieler gegeneinander antreten lassen. Verfolgen Sie die Rateversuche, ob sie korrekt erfolgen.
4. Wenn Sie von Ihrer Lösung überzeugt sind, drücken Sie auf Check, für eine automatisierte Prüfung.