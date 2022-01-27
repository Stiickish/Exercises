package Strings;

import java.util.Scanner;

public class HowToPrintFirstAndLastinArray {


    public static void main(String[] args) {            //Main
        Scanner scanner = new Scanner(System.in);       //Scanner for inputs in console

        while (true) {  //While loop running until condition met
            String input = scanner.nextLine(); //So user can write in console
            if (input.equals("")) {         //if inputs is equal empty string, then stop program
                break;
            }
            String[] first = input.split(" ");      //String array called first is equal user input. Split at " "
            System.out.println(first[0]);       //prints the first word stored in index 0
        }
    }

}

/*

    public static void main(String[] args) {        //Main
        Scanner scanner = new Scanner(System.in);       //Scanner for inputs

        while (true) {  //While loop running until condition is met
            String input = scanner.nextLine(); //So user can inputs in consol
            if (input.equals("")) {
                break;
            }
            String[] last = input.split(" ");
            System.out.println(last[last.length - 1]);
        }

    }
}

}
*/