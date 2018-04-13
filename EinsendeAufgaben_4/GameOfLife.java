import java.util.concurrent.TimeUnit;

public class GameOfLife {
    boolean[][] feld = {{false,false,false,false,false,false},{false,true,true,false,false,false},
            {false,false,true,false,true,false},{false,false,true,true,false,false},{false,false,true,false,true,false},
            {false,false,false,false,false,false}};

    public static void main(String[] args){
        GameOfLife myGame = new GameOfLife();
        for (int i = 0; i<10; i++){
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myGame.nextGeneration();
            myGame.print();
            System.out.println();

        }
    }
    void print(){
        for (int i = 0; i<feld.length; i++){
            for (int j = 0; j<feld[i].length;j++){
                if (feld[i][j]==true)
                    System.out.print("o ");
                else
                    System.out.print((". "));
            }
        System.out.println();
        }
    }

    void nextGeneration(){
        // neuer 2d Array für Übergabe der nächsten Generation
        boolean [][] next_gen = new boolean [feld.length][feld[0].length];
        // Schleifen für einzelne Positionen in Arrays
        for (int i = 0; i<feld.length;i++){
            for (int j = 0; j<feld[i].length;j++){
                int counter = 0;
                // Nicht-Beachtung der Randzellen
                if ((i == 0 || i == (feld.length-1))||(j == 0 || j == (feld[0].length-1))){
                }else{
                // interne loops von -1 bis 1 um die 8 Umgebungsfelder zu lesen
                    for (int k = -1; k <2;k++){
                    for (int p = -1; p<2;p++){
                    // eigenes Feld wird nicht gelesen
                        if (k==0&&p==0){
                        }else{
                            if (feld[i+k][j+p]==true){
                                counter +=1;
                            }
                        }
                    }

                }}
                // Übergabe ab next Gen wird durch den Counter an Lebend-Zellen in der Umgebung bestimmt im alten Feld
                if (counter == 3){
                    next_gen[i][j]= true;
                }else if((counter <2)||(counter >3)){
                    next_gen[i][j]=false;
                }else if(counter == 2){
                    next_gen[i][j]=feld[i][j];
                }
            }
         }
        feld = next_gen;
    }
}
