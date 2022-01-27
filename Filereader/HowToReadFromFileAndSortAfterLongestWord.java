package Filereader;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class HowToReadFromFileAndSortAfterLongestWord {

    public static void main(String[] args) {

        //Defining a new ArrayList object
        ArrayList<String> lines = new ArrayList<>();

// we create a scanner for reading the file
        try (Scanner scanner = new Scanner(Paths.get("Filereader/file.txt"))) {

            // we read all the lines of the file
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine()); //And adds the line to our arrayList
            }
        } catch (Exception e) { //Catches error if there is any. example no txt file with that name
            System.out.println("Error: " + e.getMessage());
        }
        String longestWord = lines.get(0); //ny variabel til at gemme det længste ord
        for (int i = 0; i < lines.size(); i++) { //Kører igennem ArrayListen med vores tekst
            String word = lines.get(i); //Variabel til at holde på ordet
            //if (longestWord.compareTo(word)) {
                longestWord = word;
            }
        }

       // System.out.println(longestWord);
// we print the total number of lines
       // System.out.println("Total lines: " + lines.size());
    }

//}

