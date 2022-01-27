package TryCatch;


import java.nio.file.Paths; //so we can read files
import java.util.Scanner;   //so we can read user inputs in console

public class TryCatchExample {

    public static void main(String[] args) {    //Main

        //Use a try catch to read a file.

        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {

            //While loop runs until there are no more lines to read in text file
            while (scanner.hasNextLine()) { //If there is a next line
                String text = scanner.nextLine(); //read it
                System.out.println(text); //print it
            }
        } catch (Exception e) { //catch error if there is any
            System.out.println("Error: " + e.getMessage());
        }

    }
}

