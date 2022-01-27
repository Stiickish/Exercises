package Test;

import java.nio.file.Paths;
import java.util.Scanner;

public class TestAfFilereader {

    public static void main(String[] args) {    //Main

        //Use a try catch to read a file.

        try (Scanner scanner = new Scanner(Paths.get("File.txt"))) {

            //While loop runs until there are no more lines to read in text file
            while (scanner.hasNextLine()) { //If there is a next line
                String text = scanner.nextLine(); //read every line
                System.out.println(text); //prints the line
            }
        } catch (Exception e) { //catch error if there is any
            System.out.println("Error: " + e.getMessage());
        }

    }
}
