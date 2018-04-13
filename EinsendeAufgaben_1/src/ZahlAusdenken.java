public class ZahlAusdenken {
    public static void main(String[] args){
        /* das Programm übergibt das (String-)Startargument in eine Integer-Variable. es wird im Verlauf geprüft, ob
        die übergebene Zahl gerade oder ungerade ist */
        int startzahl = Integer.parseInt(args[0]);
        int ergebnis = startzahl;
        /* die Variable "ergebnis" wird gleich dem Betrag der übergebenen Zahl +2 gesetzt (ermöglicht die Fall-
        unterscheidung für den Bereich [-1,1]) */
        if (ergebnis>0){
            ergebnis = ergebnis +2;
        }else{
            ergebnis = ergebnis *(-1)+2;
        }
        //"ergebnis" wird so lange um 2 reduziert bis 1 (ungerade) oder 2 (gerade) übrig bleibt
        while(ergebnis>2){
            ergebnis=ergebnis-2;
        }
        /* die Variable "arbeiten" wird über eine Schleife 10 mal um die übergebene Startzahl erhöht (Sinn er-
        schließt sicht nicht) */
        int arbeiten = 4;
        for (int i=2;i<=20;i=i+2){
            arbeiten = arbeiten + startzahl;
        }
        // über Fallunterscheidung switch wird eine Ausgabe bewirkt
        switch(ergebnis){
            case 0:
                System.out.println("Das kann nicht sein!");
                break;
            case 1:
                System.out.println("Die urpsrüngliche Zahl war ungerade!");
                break;
            case 2:
                System.out.println("Die ursprüngliche Zahl war gerade!");
                break;
            default:
                System.out.println("Fehler!");
        }
        System.out.println("startzahl = "+startzahl);
    }
}


