public class Identifyer {

    public static void main(String[] args) {
        System.out.println(args[0]);
// switch case wäre besser
        if (args[0].equals("Quadrat")){
            System.out.println(" Vier Ecken \n Vier Symmetrieachsen \n Ist punktsymmetrisch \n Ist geschlossen");
        }
        if (args[0].equals("Strecke")){
            System.out.println(" Länge \n zwei Endpunkte \n Aussage 3 \n Aussage 4");

        }
        if (args[0].equals("Dreieck")){
            System.out.println(" Aussage 1 \n Aussage 2 \n Aussage 3 \n Aussage 4");
        }
        if (args[0].equals("RechtwinkligesDreieck")){
            System.out.println(" Aussage 1 \n Aussage 2 \n Aussage 3 \n Aussage 4");
        }
        if (args[0].equals("Kreis")){
            System.out.println(" Aussage 1 \n Aussage 2 \n Aussage 3 \n Aussage 4");
        }
        if (args[0].equals("Ellipse")){
            System.out.println(" Aussage 1 \n Aussage 2 \n Aussage 3 \n Aussage 4");
        }
        if (args[0].equals("Viereck")){
            System.out.println(" Aussage 1 \n Aussage 2 \n Aussage 3 \n Aussage 4");
        }
        if (args[0].equals("Trapez")){
            System.out.println(" Aussage 1 \n Aussage 2 \n Aussage 3 \n Aussage 4");
        }
        if (args[0].equals("Pentagon")){
            System.out.println(" Aussage 1 \n Aussage 2 \n Aussage 3 \n Aussage 4");
        }
        if (args[0].equals("Hexagon")){
            System.out.println(" Aussage 1 \n Aussage 2 \n Aussage 3 \n Aussage 4");
        }
    } }