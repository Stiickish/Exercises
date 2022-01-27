package Strings;

import java.util.Scanner;

public class HowToFindTheAgeOfTheOldest {

//Hvordan man finder den ældste person vha. while loop, og split

    public static void main(String[] args) {    //Main
        Scanner scanner = new Scanner(System.in);   //For console inputs
        String input = scanner.nextLine(); //So user can write in the console
        int oldest = 0;     //New int variabel set to 0. Its empty

        while (!input.isEmpty()) { //Using while loop until condition is met. If input is not empty then put input in array
            String[] text = input.split(",");    //When splitting Strings, it will be saved to an array.
            for (int i = 1; i < text.length; i++) { //For loop, to run through our text array
                if (Integer.valueOf(text[i]) > oldest) { //We use Integer.valueOf to change it from String to int
                    oldest = Integer.valueOf(text[i]);//If text[i] is greater than oldest, then oldest is Integer.valueOf(text[i])
                }
            }
            input = scanner.nextLine(); //Empty input stops the program
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}


