package EksamensopgaveOrdleg;

import java.util.ArrayList;

public class Ordleg { //Skriv en klasse der hedder OrdLeg

    //Skriv en metode som hedder gentagOrd. Metoden tager en ArrayList af String og en parameter k af typen int
    //og har returtypen ArrayList<String>.
    public ArrayList gentagOrd(ArrayList<String> ord, int k) {

        //Metoden skal returnere en ny ArrayListe hvor hver String i input ArrayListen
        //er gentaget k gange. Et kald til metoden med en ArrayList med elementerne "hello" og "world"
        //og et Integer argument med værdien 3,skal returnere en ArrayListe med output
        //[Hello, Hello, Hello, World, World, World]
        ArrayList<String> gentagendeOrd = new ArrayList<>();

        //hvis k er 0 eller minus, skal der kastes en exception.
        if (k <= 0) {
            throw new IllegalArgumentException("Error. k can't be 0 or less");
        }
        //Hvis ArrayListen er null, skal der kastes en exception
        if (ord == null) {
            throw new IllegalArgumentException("Error. ArrayList can't be null");
        }

        //1. Første for loop løber ArrayListen igennem. Første for loop løber igennem ArrayListens størrelse.
        //Dvs. den gennemgår alle de elementer der bliver tilføjet til listen.

        //2. Anden for loop løber igennem metodens k parameter.
        //Den skal finde ud af hvor mange x antal gange den skal printe hver String ud fra ArrayListen
        for (int i = 0; i < ord.size(); i++) {
            for (int j = 0; j < k; j++) {
                //gentagendeOrd = vores ArrayList der tilføjer
                //ord.get(i) = vores ArrayList parameter og dens størrelse
                gentagendeOrd.add(ord.get(i));
            }
        }
        return gentagendeOrd; //Returnere vores ArrayList og dens værdier
    }
}
/*
    public void sorteretOgTrimmet(ArrayList<String> sort) {
        ArrayList<String> sortAndTrimmed = new ArrayList<>();

        if (sort == null) {
            throw new IllegalArgumentException("Error. ArrayList can't be null.");
        }
        for (int i = 0; i < sort.size(); i++) {
            for (int j = 0; i < i; j++) {
                sortAndTrimmed.add(sort.get(i));
            }

        }

    }

}
*/