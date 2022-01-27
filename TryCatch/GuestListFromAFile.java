package TryCatch;


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    //Opgaven gennemgår scanner, try catch, hvordan man bruger try catch til at finde specielle elementer


    public static void main(String[] args) {        //Main
        Scanner scanner = new Scanner(System.in);   //Scanner

        System.out.println("Name of the file:");    //Print
        String file = scanner.nextLine();   //scanner for user inputs

        ArrayList<String> list = new ArrayList<>(); //New arrayList
        // implement reading the file here.
        try (Scanner scan = new Scanner(Paths.get(file))) { //Try catch around new scanner
            while (scan.hasNextLine()) { //As long there is a next line in the text, add it to array list
                list.add(scan.nextLine());
            }
        } catch (Exception e) { //if there is no file equals to input, then error message
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(""); //print empty line

        System.out.println("Enter names, an empty line quits.");    //print
        while (true) {
            String name = scanner.nextLine(); //scanner input
            if (name.isEmpty()) { //If input is empty string, stop program
                break;
            }

            if (list.contains(name)) { //if array list contains a special name
                System.out.println("The name is on the list."); //print
            } else {
                System.out.println("The name is not on the list."); //print
            }
        }

        System.out.println("Thank you!");
    }
}

