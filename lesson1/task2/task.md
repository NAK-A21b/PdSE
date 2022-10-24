#Aufgabe

Wie Sie sicherlich schon bemerkt haben, ist der Computerspieler sehr langweilig, was die zu ratende Zahl betrifft. 
Es soll immer dieselbe Zahl geraten werden.
Falls Sie das jedoch nicht bemerkt haben, spielen Sie bitte HumanVsComputer aus task0 oder task1 mehrfach. 

Es sollten andere Strategien für den Computer umgesetzt werden. Zum Beispiel, dass die zu ratende Zahl vom Computer zufällig gewählt wird.

Da wir mit der Objektorientierung erweiterbare Software anstreben, soll diese Anforderung nicht als Modifikation 
sondern als Erweiterung umgesetzt werden.
Wir schreiben also eine neue Klasse ComputerPlayer1, die mit der entsprechenden Logik versorgt werden soll.

Zwei wichtige Punkte, die Sie bitte verinnerlichen:
1. Da wir eine neue Klasse verwenden, läuft die alte Software immer noch, da ja nichts angefasst wird.
2. Da die GuessMyNumber mit Interfaces arbeitet und deshalb die konkreten Klassen gar nicht kennt, 
   können wir die GuessMyNumber Klasse auch mit der neuen Klasse nutzen. GuessMyNumber ist für unterschiedliche Spielerklassen wiederverwendbar.

Beachten Sie dass der Punkt 2 sehr leicht ausgehebelt werden kann: GuessMyNumber darf weder Exemplarvariablen, noch lokale Variablen, Parameter oder Methoden nutzen, die direkt oder indirekt auf die konkreten Spielerklassen verweisen. 
Da kann schon eine Stringkonstante, die von einer bestimmten konkreten Klasse erwartet wird, die Wiederverwendbarkeit zerstören. 
Gerade für Anfänger ist die Versuchung groß OO zu umgehen, wenn der Einsatz von Interfaces noch nicht komplett verstanden wurde.

#Was soll man tun?

1. Passen Sie die Klasse ComputerPlayer1 so an, dass die zu ratende Zahl zufällig aus dem Bereich LOWER_LIMIT bis UPPER_LIMIT kommt. 
   Dabei können beide Grenzen auftreten.
2. Wenn Sie noch nicht mit Zufallszahlen gearbeitet haben, lesen Si bitte hierzu https://docs.oracle.com/javase/8/docs/api/java/util/Random.html#nextInt-- .
3. Probieren Sie HumanVsComputer1 aus.
4. Wenn Sie überzeugt sind, die richtige Lösung zu haben, klicken Sie auf Check.

