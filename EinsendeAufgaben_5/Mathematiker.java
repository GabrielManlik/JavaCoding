public class Mathematiker {
        public static void main(String[] args) {

            try {
                // in diesem Try-catch statement wird eine Exception geworfen mit "Ich liebe", da ((7%5)/2==1) wahr ist
                try {
                    int i = 7 % 5;
                    if ((i / (i % 2)) == 1) {
                        throw new Exception();
                    }
                    System.out.println("Ich mag");
                }
                catch (Exception e) {
                    System.out.println("Ich liebe");
                    // hier wird die nächste Exception geworfen: "es,", da ((7 % 6 / (7 % 6 % 2)) == 1) wahr ist
                    try {
                        if ((7 % 6 / (7 % 6 % 2)) == 1) {
                            throw new Exception();
                        }
                        System.out.println("nichts mehr, als");
                    } catch (Exception u) {
                        System.out.println("es,");
                    } }
                // folgend nach normalem Programmablauf wird "wenn" ausgegeben
                System.out.println("wenn");
                try {
                    // True & false = false -> case 1  -> "ein Programm"
                    int i = true & false ? 0 : 1;
                    switch (i) {
                        case 0:
                            System.out.println("eine Formel");
                        case 1:
                            System.out.println("ein Programm");
                        default:
                            throw new Exception();
                    }
                } catch (ArithmeticException e) {
                    System.out.println("abbricht.");
                // letzenendes wird diese Exception geworfen, da keine "break;" Anweisung vorhanden ist -> "funktioniert."
                } catch (Exception e) {
                    System.out.println("funktioniert.");
                }
                finally {
                    int i = false && true ? 0 : 2;
                    switch (i) {
                        case 1:
                            System.out.println(";)");
                        default:
                            throw new Exception();
                    } }
            } catch (ArithmeticException e) {
                System.out.println(":(");
            } catch (Exception e) {
                System.out.println(" ");
            } }

}

