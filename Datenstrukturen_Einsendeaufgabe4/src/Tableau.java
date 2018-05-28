public class Tableau {

    public int[][] tableau;
    private int size;
    private int e;

    /* für Aufgabenteil d
    public int [] Sortierung_1d;
    public int Loeschcounter;
     */


    public Tableau(int i){
        this.size = i;
        this.tableau = new int [size][size];
        /* Aufgabenteil d
        this.Sortierung_1d = new int [size*size]
        this.Loeschcounter = 0;
         */
    }


    public void Einfuegen(int e) {
        int Hilfswert1;


        // Durchlauf Beginn
        for (int k = 0; k < size; k++) {
            for (int j = 0; j < size; j++) {
                //Case 1: e ist nicht das größte Element, d.h.Austausch
                if (tableau[k][j] > e) {
                    Hilfswert1 = tableau[k][j];
                    tableau[k][j] = e;
                    e = Hilfswert1;
                    break;
                }
                    //Case 2: e ist das größte Element in der Zeile
                    if (tableau[k][j] == 0) {
                        tableau[k][j] = e;
                        return;
                    }
                }
        }
    }


    public void Loeschen(){
        int [][] replacement_array = new int [size][size];
        int [] Zeile_1 = new int [size];
        int counter=0;

        //Übertrag des "alten" array ab der 2. Zeile in den Platzhalter
        for (int j=1; j<size; j++){
            for (int l = 0; l < size; l++){
                replacement_array[j-1][l]=tableau[j][l];
            }
        }
        /*Aufgabenteil d)
        Sortierung_1d [Loeschcounter]= tableau[0][0];
        Loeschcounter =+1;
         */



        // in einem 1d array werden die Werte ab [0,1] übertragen
        for (int j=1; j<size; j++){
            if (tableau[0][j] != 0){
                Zeile_1[j-1] = tableau[0][j];
                counter += 1;
            }else{
                break;
            }
        }

        // tableau wird durch den Platzhalter ersetzt und die vorher erstellte Methode "Einfügen" wird für alle
        // Elemente aus Zeile 1 verwendet, die weiterhin vorhanden sein sollen.

        tableau = replacement_array;
        for (int p =0; p<counter; p++){
            this.Einfuegen(Zeile_1[p]);
        }
    }

    public void Ausgabe(){
    // sehr einfache Vorgehensweise, dient nur der graphischen Darstellung
        for (int i = 0; i<size;i++){
            for(int j = 0; j<size;j++){
                System.out.print(" | ");
                if (tableau[i][j]==0){
                    System.out.print("  ");
                }else if((tableau[i][j]<10)){
                    System.out.print(" ");
                    System.out.print(tableau[i][j]);
                }else{
                    System.out.print(tableau[i][j]);
                }
            }
            System.out.println();
        }
    }
}
