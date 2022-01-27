package Spillere;

import java.util.Random;

public class Robotspiller implements Spiller{


    public int guessNumber(int max) {
        int guessedInt=0;
        Random random = new Random();

        guessedInt = random.nextInt(max);

        return guessedInt;
    }

    @Override
    public int gætEtTal(int max) {
        return guessNumber(max);
    }
}
