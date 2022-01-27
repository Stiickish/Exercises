package TryCatch;

import java.nio.file.Paths;
import java.util.Scanner;


public class TryCatchAndSplit {

    //Hvordan man bruger try catch til at læse fra en fil
    //Hvordan man bruger metoden split til at splitte strenge ved komma og gemme det i et array


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //Scanner input

        System.out.println("Name of the file: ");   //ask for file name

        String fileName = scanner.nextLine();   //so we can input in console

        try (Scanner scan = new Scanner(Paths.get(fileName))) { //Try read txt file
            while (scan.hasNextLine()) {    //runs as long there is a next line in txt

                //splits strings from txt file at ",". Saves every word before and after ","
                //in an array called splitString
                String[] splitString = scan.nextLine().split(",");

                if (splitString.equals("")) { //if there is an empty string
                    continue; //do nothing, continue reading
                }
                String name = splitString[0];   //saves name in index 0 at array
                int age = Integer.valueOf(splitString[1]);  //saves age in index 1 at array

                //if age is above 1 or 0 then it is years. Else its year
                if (age > 1 || age == 0) {
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }
            }

        } catch (Exception e) { //print error if no file exists
            System.out.println("Error: " + e.getMessage());
        }

    }

}
