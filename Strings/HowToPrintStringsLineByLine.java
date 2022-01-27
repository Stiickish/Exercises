package Strings;

import java.util.Scanner;

public class HowToPrintStringsLineByLine {

//Hvordan man printer Strings linje efter linje vha. en while loop


    public static void main(String[] args) {        //Main
        Scanner scanner = new Scanner(System.in);       //input

        String input = scanner.nextLine();      //bruger input

        while (!input.isEmpty()) {          //Hvis input IKKE er tomt
            String[] text = input.split(" ");       //Skal gemme input i et array og splitte ved " "
            for (String s : text) {         //Kører igennem arrayet via en for each loop
                System.out.println(s);          //printer arrayet ud
            }
            input = scanner.nextLine();         //Hvis input er tomt, så stop programmet
        }


    }

}
