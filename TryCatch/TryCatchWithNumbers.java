package TryCatch;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TryCatchWithNumbers {

    //Hvordan man bruger try catch til at læse fra en fil
    //Hvordan man regner  x antal tal ud fra 2 parametre

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? "); //Ask for a file name
        String file = scanner.nextLine();   //First answer
        System.out.print("Lower bound? ");  //Ask for lower bound number
        int lowerBound = Integer.valueOf(scanner.nextLine());   //Second answer
        System.out.print("Upper bound? ");  //Ask for upper bound number
        int upperBound = Integer.valueOf(scanner.nextLine());   //Third answer

        int count = 0; //used for counting how many numbers inbetween lower/upper bounds

        try (Scanner scan = new Scanner(Paths.get(file))) { //trying to read from file
            while (scan.hasNextLine()) { //Runs as long there is a next line in txt file
                int number = Integer.valueOf(scan.nextLine()); //user input

                //If number(our input) is higher or equals lowerbound AND
                //number (our input) is lower or equals to upperBound, then count.
                //else do nothing
                if (number >= lowerBound && number <= upperBound) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);    //print the count

        } catch (Exception e) {    //print error message if no file name exists
            System.out.println("Error: " + e.getMessage());
        }
    }

}


