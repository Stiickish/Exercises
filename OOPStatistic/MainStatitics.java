package OOPStatistic;

import java.util.Scanner;

public class MainStatitics {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statistics = new Statistics(); //New object of statistics
        Statistics evenNumber = new Statistics(); //New object of Statistics
        Statistics oddNumber = new Statistics(); //New object of Statistics

        //statistics.addNumber(3); //adds number to addNumber method
        //statistics.addNumber(5); //adds number to addNumber method
        //statistics.addNumber(1); //adds number to addNumber method
        //statistics.addNumber(2); //adds number to addNumber method
        //System.out.println("Count: " + statistics.getCount()); //print the getCount method.
        //System.out.println("Sum: " + statistics.sum()); //prints the sum method
        //System.out.println("Average: " + statistics.average()); //prints the average method
        //Implement a program, that ask the user for inputs until user enters -1.
        //The program will then stop and provide the sum of the numbers entered.
        //The program should use Statistics object to calculate the sum
        System.out.println("Enter numbers: ");
        while (true) { //while loop, until condition is met
            int input = Integer.valueOf(scanner.nextLine()); //So user can write in console

            if (input == -1) { //If input is -1. Stop program
                break;
            }
            statistics.addNumber(input); //Add our inputs to addNumber method.

            if (input % 2 == 0) { //If user input modulus 2 is equal to 0
                evenNumber.addNumber(input); //Then it is a even number
            } else {
                oddNumber.addNumber(input); //Otherwise it is a odd number
            }
        }
        System.out.println("Sum: " + statistics.sum()); //Prints the sum method.
        System.out.println("Sum of even numbers: " + evenNumber.sum());
        System.out.println("Sum of odd numbers: " + oddNumber.sum());

        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers,
        // and lastly the one that tracks the sum of odd numbers!
    }
}

