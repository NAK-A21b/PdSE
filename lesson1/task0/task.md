#Projekt kennenlernen
Rate meine Zahl ist ein einfaches Spiel für zwei Personen. Einer wählt sich eine beliebige maximal zweistellige nicht 
negative ganze Zahl und schreibt sie auf einen Zettel. 0 ist die kleinste erlaubte Zahl und 99 die größte.
Der andere versucht die Zahl zu raten. Nach jedem Rateversuch wird gesagt, ob die Zahl zu groß oder zu klein ist. 
Ist sie richtig wird der Zettel genutzt, um zu überprüfen, dass der Wählende nicht einfach seine Zahl geändert hat.

Die Anzahl der Rateversuche kann genutzt werden, um zu entscheiden, wer von den beiden Spielern gewonnen hat.

In dieser Übung ist das Spiel umgesetzt.

Die Klasse GuessMyNumber setzt den Spielverlauf um und verhindert, dass Zähler oder Rater schummeln können.
1. Zuerst wird der Zahlenwähler gefragt, welche Zahl er wählen möchte.
2. Dann wird der Rater um seinen Rateversuch gebeten und mit der zu ratenden Zahl verglichen. 
  Der Rater wird über das Ergebnis informiert.
3. Schritt 2 wird so lange wiederholt, bis die Zahl richtig erraten wurde.
4. Am Ende werden die Rateversuche in einen Gewinn oder einen Verlust für den Rater umgerechnet.

Es gibt Spielerklassen, die das Wählen und Raten umsetzen. Eine Klasse (ComputerPlayer) verwendet fest programmierte 
Algorithmen, eine andere (HumanPlayer) nutzt Konsolen Ein- und Ausgaben um einen Menschen mitspielen zu lassen. 
Prinzipiell können Spieler beide Rollen ausfüllen: Wählen und Raten. 

Die Umrechnung der Rateversuche in einen Gewinn wird von einer dritten Art von Klassen (PayPerGuess oder PayPerSuccess) 
umgesetzt.

Ein Hauptprogramm HumanVsComputer erzeugt die erforderlichen Objekte um einen Menschen gegen den Computer spielen zu lassen. 
Der Mensch ist der Rater.



#Was ist zu tun?
1. Spielen Sie GuessMyNumber indem Sie das Hauptprogramm HumanVsComputer starten. Der Mensch hat die Rolle des Raters. 
   Welche Strategie verfolgt der Computer beim Ausdenken der Zahl?
2. Machen Sie sich mit den Klassen vertraut. Schauen Sie sich dazu den Sourcecode an.
   Wer benutzt was?
3. Machen Sie sich mit den Interfaces vertraut.
   Wozu dienen sie? Wer implementiert sie?
4. Beantworten Sie danach die Multiple Choice Fragen. Lesen Sie genau und denken Sie nach. 
   Es sind knifflige Fragen dabei.
5. Wenn Sie alle Fragen beantwortet haben, klicken sie auf Check.