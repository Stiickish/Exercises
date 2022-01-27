package Spillere;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Spiller menneske = new Menneskespiller();
        Spiller robot = new Robotspiller();

        int max = 50;
        System.out.println("Gæt et tal mellem 0 og " + max);


        Gættespil gs = new Gættespil(24);

    }
}
