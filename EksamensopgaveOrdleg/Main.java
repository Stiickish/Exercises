package EksamensopgaveOrdleg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> ord = new ArrayList<>(); //Laver en ny String ArrayList kaldet ord.

        ord.add("Hello"); //Tilføjer ordet
        ord.add("World"); //Tilføjer ordet

        //Instantiere et nyt objekt af klassen Ordleg
        //Så vi kan bruge metoden gentagOrd.
        Ordleg ordleg = new Ordleg();

        //Printer ordleg. metoden kræver 2 parameter ligesom metoden vi lavede
        //ord som er vores arrayliste og 3 er for de antal gange der skal printes
        System.out.println(ordleg.gentagOrd(ord,3));


    }
}
