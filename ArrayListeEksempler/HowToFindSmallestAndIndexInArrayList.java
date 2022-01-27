package ArrayListeEksempler;

import java.util.ArrayList;
import java.util.Scanner;

public class HowToFindSmallestAndIndexInArrayList {

//Hvodan man finder det mindste nummer i en arrayliste, med user inputs
// Og hvordan man finder ud af hvilket index det tal befinder sig.

    public static void main(String[] args) {            //Main
        Scanner scanner = new Scanner(System.in);       //Scanner til bruger inputs i konsolen

        ArrayList<Integer> numbers = new ArrayList<>(); //Ny ArrayListe af INTEGER med navnet numbers

        while (true) {          //While loop
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {            //Hvis input fra brugeren er 9999. Stop program
                break;
            }
            numbers.add(input);         //Tilføj brugerens input til arraylisten
        }
        int smallest = numbers.get(0);          //Ny variabel som hedder smallest. Default er 0

        for (int i = 0; i < numbers.size(); i++) {          //For loop som kører igennem arraylisten
            int number = numbers.get(i);            //Ny variabel number som skal holde nummeret i arraylisten
            if (smallest > number) {                //Hvis variabel smallest er større end number
                smallest = number;                  //smallest er number
            }
        }
        System.out.println("Smallest number is: " + smallest);

        for (int i = 0; i < numbers.size(); i++) {          //For loop til at køre igennem arraylisten ige
            if (numbers.get(i) == smallest) {               //Hvis arraylisten er det samme som smallest
                System.out.println("Found at index: " + i); //print index
            }
        }

    }
}

// after that, the program prints the smallest number
// and its index -- the smallest number
// might appear multiple times

