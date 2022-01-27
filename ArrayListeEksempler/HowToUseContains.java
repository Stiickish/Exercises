package ArrayListeEksempler;

import java.util.ArrayList;
import java.util.Scanner;

public class HowToUseContains {

    //Hvordan man bruger keyword "CONTAINS" i ArrayList.

    public static void main(String[] args) {        //Main
        Scanner scanner = new Scanner(System.in);   //Scanner input i konsol

        ArrayList<String> list = new ArrayList<>();     //Ny ArrayListe af STRING og hedder list
        while (true) {          // while loop
            String input = scanner.nextLine();
            if (input.equals("")) {         //Hvis input er lig med "" tom String, luk program
                break;
            }

            list.add(input);            //Tilføj elementer til ArrayListen

        }
        System.out.println("Search for? ");
        String input = scanner.nextLine();
        if (list.contains(input)) {         //hvis ArrayList indeholder brugerens input, så print ja, ellers print nej
            System.out.println(input + " was found!");
        } else {
            System.out.println(input + " was not found!");
        }

    }

}
