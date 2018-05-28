import java.io.IOException;
import java.util.Scanner;
public class Main {

// Die Main Methode erzeugt hier ein 2d-Array der Größe 10 und liest dann so lange Zahlen ein, bis -1 eingegeben wird


    public static void main(String[] args){
        int input = 0;
        Tableau Tableau = new Tableau(10);

        System.out.println("Bitte Zahlen eingeben, die in das Tableau eingetragen werden sollen. '-1' beendet die Eingabe.");
        while(input != -1){
            try{
                Scanner in = new Scanner(System.in);
                input = in.nextInt();
            }catch (Exception e){
                System.out.print("Fehler bei der Eingabe");
            }

            if (input != -1){
                Tableau.Einfuegen(input);
            }
        }

        Tableau.Ausgabe();
        System.out.println("____________________________________");
        Tableau.Loeschen();
        Tableau.Ausgabe();

    }
}
