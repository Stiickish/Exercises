package Strings;

import java.util.Scanner;

public class HowToPrintStringsThatContains {

    //Hvordan man printer Strings udfra ens input som indeholder noget bestemt

    public static void main(String[] args) {        //Main
        Scanner scanner = new Scanner(System.in);       //scanner til inputs i konsolen

        String input = scanner.nextLine();      //Bruger input

        while (!input.isEmpty()) { //If input is not an empty String then -->
            String[] text = input.split(" "); //String[] array named text is our input, split at " "
            for (String s : text) {   //run through the array
                if (s.contains("av")) { //If the input contains any word with "av" -->
                    System.out.println(s); //Then print s which is the word from our input array
                }
            }
            input = scanner.nextLine(); //programs stops at empty input
        }

    }
}