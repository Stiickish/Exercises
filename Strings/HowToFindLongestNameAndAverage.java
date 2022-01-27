package Strings;

import java.util.Scanner;

public class HowToFindLongestNameAndAverage {

//Hvordan man finder en person med det længste navn, samt gennemsnit af alder udfra bruger inputs

    public static void main(String[] args) {        //Main
        Scanner scanner = new Scanner(System.in);       //Scanner for inputs in console

        String longestName = null;  //New String variabel longestName. Set it to 0 so you can store a name in it.
        int name = 0; //New int variabel name. Set it to 0, so you can store the name with the oldest birth age
        int sum = 0;    //New int variabel sum. Use it to calculate the sum of all the user inputs
        double average = 0; //New double variabel average. Use it to calculate the average of all the user inputs
        int count = 0;  //New int variabel count. Use it to count the number of user inputs

        while (true) {      //While loop. Runs until condition is met.
            String input = scanner.nextLine();    //So user can write in console
            String[] text = input.split(",");      //Splits the user inputs at , and stores it in an array called text

            if (input.equals("")) {     //If statement. If user input is an empty input
                break;                    //End while loop and stop the program.
            }
            if (text[0].toCharArray().length > name) {    //If String[] text at zero index is bigger than name which is 0
                name = text[0].toCharArray().length;       //Then set that name equals that String[]. Until a new name is longer
                longestName = text[0];                      //Sets the longest name to our String[], so we can find the longest name
            }
            count++;      //Count the number of inputs
            sum = sum + Integer.valueOf(text[1]);     //Sum is set to be sum + our text array at index 1, which is where our name is stored.
        }
        average = (double) sum / count;  // We calculate the average births by dividing sum with count. (double) is set before, so the output will be a comma number
        System.out.println("Longest name: " + longestName);     //Prints the longestName
        System.out.println("Average of the birth years: " + average);       //Prints the average of birth years
    }

}

