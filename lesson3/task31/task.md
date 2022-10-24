# Aufgabe

In dieser Task soll das Factory Pattern eingesetzt werden.
Statt der IPlayer werden nun  IPlayerFactories injiziert. Dadurch können
neue IPlayer erzeugt werden, wann immer man es möchte. Dabei bleibt der 
Typ des erzeugten Objektes unbekannt. Das ist das Hauptziel dieser Technik: 
keine Abhängigkeiten von konkreten Spieler Klassen.  

#Was soll man tun?

1. In dem IFactory Interface muss der Typ des Return-Values der create Methode angegeben werden. Selbstverständlich wird 
   hier keine konkrete Klasse angegeben.
2. In den Implementation ComputerPlayer1Factory des Interfaces muss die create Methode implementiert werden, indem ein neues Objekt einer 
   konkreten Klasse mit new erzeugt wird. Als Rückgabetyp kann auch die konkrete Klasse angegeben werden, weil sie den geforderten 
   Typ aus dem IPlayerFactory Interface erweitert.
3. Bearbeiten Sie auch die ComputerPlayer1Factory. Die IComputerPlayer2 ist schon fertig.
4. Im Objekte der Klasse Tournament müssen nun IPlayerFactories injiziert werden. Sie werden in einer Exemplarvariablen 
   gespeichert. Vor jedem GuessMyNumber Game müssen die Spieler neu erzeugt werden. Passen Sie die Tournament Klasse an 
   den geforderten Stellen an.
5. Sorgen Sie dafür, dass Tournament in der main Methode aus RunTournament drei konkrete Factories übergeben werden.
6. Schließlich ist können Sie das Initialisieren der Grenzwerte nach einem erfolgreichem Rateversuch aus der Klasse 
   ComputerPlayer2 löschen.
7. Testen Sie Ihre Anwendung und wenn Sie sicher sind, dass die Anwendung richtig programmiert ist, klicken Sie auf Check.
8. Viel Erfolg.

