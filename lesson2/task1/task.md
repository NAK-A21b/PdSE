#Aufgabe 4

In dieser Aufgabe sollen Sie eine Klasse programmieren, die mittels Dependency Injection Ihre konkreten Objekte erhält.

Die Klasse Tournament soll GuessMyNumber Turniere für beliebig viele Spieler umsetzen.


Dazu benötigt ein Objekt der Klasse
1. eine Anzahl von Runden, die die einzelnen spieler gegeneinander antreten,
2. eine Abrechnungsregel, nach der einzelne Spiele bewertet werden und
2. eine Array von Spielern die teilnehmen.

Sowohl die Abrechnungsregel als auch das Array von Spielern muss den Interfaces benutzen, damit Tournament nicht von 
konkreten Klassen abhängt.

Bemerkung: Es sollte ein Array und nicht eine Liste verwendet werden, da sich die Anzahl der Spieler in einem Turnier nie ändert. 
Durch das Varargs Feature ... statt [] können die statt eines Arrays auch einfach mehrere, durch Komma getrennte Spieler übergegeben.
Siehe hierfür auch [Java ist auch eine Insel](http://openbook.rheinwerk-verlag.de/javainsel/03_008.html#u3.8.12)


#Was soll man tun?
1. Schauen sie sich die Klasse Tournament an. Welche Methoden gibt es? Was machen diese?
2. Passen Sie die Klassen Tournament und RunTournament entsprechend der Angaben in den Klassen an.
3. Probieren Sie RunTournament aus.
4. Wenn Sie sich sicher sind, dass Sie alles richtig programmiert haben, klicken sie auf Check.