package ArrayListeEksempler;

import java.util.ArrayList;
import java.util.Scanner;

public class HowToFindIndexOfInArrayList {

//Hvordan man finder et bestemt element i arrayet og får den til at skrive ud, at elementet er på plads x

    public static void main(String[] args) { //Main
        Scanner scanner = new Scanner(System.in); //Scanner inputs

        ArrayList<Integer> list = new ArrayList<>(); //Ny arrayliste
        while (true) { //While loop
            int input = Integer.valueOf(scanner.nextLine()); //Input
            if (input == -1) { //Hvis input er lig -1 stop program
                break;
            }

            list.add(input); //Tilføj til arrayliste
        }

        System.out.println("");
        System.out.println("Search for? ");

        int input = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) { //For loop. Kører igennem hele listen
            int number = list.get(i); //Ny variabel til at holde nummeret på i plads
            if (number == input) { //Hvis number er lig bruger input
                System.out.println(number + " is at index " + i);
            }

        }

    }

}
