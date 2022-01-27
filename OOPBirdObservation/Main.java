package OOPBirdObservation;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();
        TextIo io = new TextIo(scan, db);
        io.start();

    }

}
