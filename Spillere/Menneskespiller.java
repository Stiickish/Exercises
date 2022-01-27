package Spillere;

import java.util.Scanner;

public class Menneskespiller implements Spiller {

    private int guessNumber() {
        int guessedInt = 0;
        Scanner scanner = new Scanner(System.in);

        guessedInt = Integer.parseInt(scanner.nextLine());

        return guessedInt;
    }

    @Override
    public int gætEtTal(int max) {
        return guessNumber();
    }
}