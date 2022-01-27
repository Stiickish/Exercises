package ArrayListeEksempler;

import java.util.ArrayList;
import java.util.Scanner;

public class HowToFindTheBiggestNumber { //Class

    //Hvordan man finder det største nummer i en arraylist

    public static void main(String[] args) { //Main
        Scanner scanner = new Scanner(System.in); //input i konsol

        ArrayList<Integer> list = new ArrayList<>(); //ny arraylist
        while (true) { //while løkke
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) { //afslut program hvis -1
                break;
            }

            list.add(input); //tilføj til listen
        }

        System.out.println("");

        int biggest = list.get(0); //Ny variabel til at holde på tallet
        for (int i = 0; i < list.size(); i++) { //Kører igennem listen med size()
            int number = list.get(i); //ny variabel til at holde tallet
            if (biggest < number) { //Hvis input er større end biggest, som er sat til 0 pr default
                biggest = number; //Skal biggest erstattes med det største input nummer
            }

        }
        // implement finding the greatest number in the list here
        System.out.println("The biggest number is: " + biggest);
    }
}

