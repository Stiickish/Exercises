package EksamensopgaveHilsen;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GreetingsFileReader {

    Random random = new Random();

    public String getGreetings() {
        ArrayList<String> words = new ArrayList<>();

        try {
            File readFile = new File("src/greetings.txt"); //Try read file from this path..
            Scanner scanner = new Scanner(readFile); //Instantiate a new scanner object with our file


            //Incooperate random, so we can get a random line.
            while (scanner.hasNextLine()) { //While loop runs aslong there is a next line in txt file
                String row = scanner.nextLine();    //we read the lines
                words.add(row);

                // System.out.println(row); //we print the lines

            }
            // int count = words.size();
        } catch (Exception e) { //catching whatever error we have
            System.out.println("Error: " + e.getMessage());
        }
        //Must return a String
        return getRandomGreetings(words);

    }

    public String getRandomGreetings(ArrayList<String> words) {
        Random random = new Random();
        int number = random.nextInt(words.size());

        return words.get(number);
    }

}
