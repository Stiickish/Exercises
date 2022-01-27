package TryCatch;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TryCatchOOP {

    //Hvordan man bruger try catch og metodekald med flere klasser

    public class StoringRecords {


        public static void main(String[] args) {    //Main
            Scanner scan = new Scanner(System.in);  //Scanner for input

            System.out.println("Filename:");    //Ask for file name
            String file = scan.nextLine();      //User answer in console

            ArrayList<Person> records = readRecordsFromFile(file);  //ArrayList
            System.out.println("Persons: " + records.size());   //print size of the arraylist
            System.out.println("Persons:");
            for (Person person : records) { //go through the arraylist
                System.out.println(person); //print out person arraylist

            }
        }

        public static ArrayList<Person> readRecordsFromFile(String file) {
            ArrayList<Person> persons = new ArrayList<>();

            try (Scanner scan = new Scanner(Paths.get(file))) { //try read file

                while (scan.hasNextLine()) {    //as long there is a next line
                    String userInput = scan.nextLine(); //user input

                    String[] stringSplit = userInput.split(",");    //saves it to an array
                    String name = stringSplit[0];   //saves name on index 0
                    int age = Integer.valueOf(stringSplit[1]);  //saves age on index 1

                    persons.add(new Person(name, age)); //adding name and age to person arrayList

                }

            } catch (Exception e) { //error handling if no txt name exists
                System.out.println("Error: " + e.getMessage());
            }
            // Write here the code for reading from file
            // and printing the read records
            return persons; //return our persons arrayList back, so we can call the method in main

        }
    }

}
