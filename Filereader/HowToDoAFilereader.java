package Filereader;

import java.io.File;
import java.util.Scanner;

public class HowToDoAFilereader {

    public static void main(String[] args) {
        try {
            File readFile = new File("src/Filereader/file.txt"); //Try read file from this path..
            Scanner scanner = new Scanner(readFile); //Instantiate a new scanner object with our file

            while(scanner.hasNextLine()){ //While loop runs aslong there is a next line in txt file
                String row = scanner.nextLine();    //we read the lines
                System.out.println(row); //we print the lines

            }
        }catch(Exception e){ //catching whatever error we have
            System.out.println("Error: " + e.getMessage());
        }
    }
}
