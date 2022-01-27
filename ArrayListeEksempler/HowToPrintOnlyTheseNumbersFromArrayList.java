package ArrayListeEksempler;

import java.util.ArrayList;
import java.util.Scanner;

public class HowToPrintOnlyTheseNumbersFromArrayList {

    //Hvordan man finder 2 forskellige numre udfra en ArrayList, med inputs fra bruger.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner! Til at kunne skrive i konsolen

        ArrayList<Integer> numbers = new ArrayList<>(); //Ny ArrayList af INTEGER som hedder NUMBERS
        while (true) { //While løkke
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) { //Hvis input er lig med -1. Afslut
                break;
            }

            numbers.add(number); //Tilføj elementer til arraylist

        }

        System.out.println("From where? ");
        int from = Integer.valueOf(scanner.nextLine());
        System.out.println("To where? ");
        int to = Integer.valueOf(scanner.nextLine());
        for (int i = from; i <= to; i++) {
            //Går igennem listen med en for løkke, start punkt er FROM slutpunkt er TO.
            //i++ tæller fra start til slut punkt og printer derefter ud
            System.out.println(numbers.get(i));
        }

    }
}

