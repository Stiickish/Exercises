package EksamensopgaveToSlagsSpillere;

import java.util.Random;

public class Computerspiller implements Spiller {

    @Override
    public int gætEtTal(int max) {
        Random rand = new Random(max);
        int input = rand.nextInt(max)+1;
        System.out.println("Computeren gættede: " +input);

        return input;//returnere metoden, som vi kalder i main
    }

}
