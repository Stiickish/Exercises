package TryCatch;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class HowToUseContainsInTryCatch {

    //Denne opgave handler om, hvordan man bruger keyword "contains", try catch og scanner
    //Til at finde bestemte navne fra tekstfiler

    public static void main(String[] args) {    //Main
        Scanner scanner = new Scanner(System.in);   //Scanner for inputs

        System.out.println("Name of the file:");    //Print
        String file = scanner.nextLine();   //So user can type the file name

        System.out.println("Search for:");  //Print
        String searchedFor = scanner.nextLine();    //What user is searching for

        ArrayList<String> list = new ArrayList<>(); //ArrayList to store objects in

        try (Scanner scan = new Scanner(Paths.get(file))) { //Try catch for reading a file
            while (scan.hasNextLine()) {    //As long there is a next line
                list.add(scan.nextLine());  //Add our input to the ArrayList
            }
            if (list.contains(searchedFor)) {   //if our ArrayList contains a input we are looking for
                System.out.println("Found!");   //Print found
            } else {    //If it doesn't contain it, then print not found
                System.out.println("Not Found.");
            }
        } catch (Exception e) { //if we can't find the file name, print error message
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}

