package ArrayListeEksempler;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingToArrayListAndGettingElementWithUserInputString {

    //Hvordan man tilføjer elementer til arraylisten og derefter printer det tal ud på x plads

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Scanner til inputs

        ArrayList<String> list = new ArrayList<>(); //Laver en NY arrayliste af TYPEN STRING. ArrayListen hedder LIST
        while (true) {
            String input = scanner.nextLine(); //Så man kan skrive tekst i konsol
            if (input.equals("")) { //Hvis input er tomt, skal den ud af loop
                break;
            }
            list.add(input); //Tilføjer input til arraylisten
        }
        System.out.println(list.get(2)); //Printer vores input som er på plads nummer 3 (0-1-2)
    }
}
