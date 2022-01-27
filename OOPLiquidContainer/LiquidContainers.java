package OOPLiquidContainer;

import java.util.Scanner;

public class LiquidContainers {

    /*
    "add amount" adds the amount of liquid specified by the parameter to the first
    container. The inserted amount must be specified as an Integer.
    The container can't hold more tjan a hundred liters and everything added past
    that will go to waste.

    "move amount" moves the amount of liquid specified by the parameter from the first
    containter to the second container. The given amount must be specified as an Integer.
    If the program is requested to move more liquid than than the first container currently
    holds, move all the remaining liquid. The second container cant hold more than one hundred
    liters of liquid and everything past that will go to waste.

    "remove amount" removes the amount of liquid specified by the parameter from the
    second container. If the program is requested to remove more liquid than the container
    currently holds, remove all the remaining liquid.

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0; //first containter variable
        int second = 0; //second container variable

        //While loops keep running until input is quit.
        //until then we can keep add, move and remove the liquids around
        while (true) {

            System.out.println("First: " + first + "/" + "100");
            System.out.println("Second: " + second + "/" + "100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" "); //Splits at break
            String UserCommand = parts[0];  //Store it at index 0
            int amount = Integer.valueOf(parts[1]); //Parse the input to an Integer

            //If our amount is less than 1, then continue
            if (amount < 1) {
                continue;
            }
            //If input is "add"
            //And first container + amount is less than 0
            //Then first is the total of first + amount.

            //If container + amount isn't less than 0,
            //then container first must be at 100 % (full)
            if (UserCommand.equals("add")) {
                if (first + amount <= 100) {
                    first = first + amount;
                } else {
                    first = 100;
                }
            }
            //If input is "move"
            //And amount is bigger than first container
            //Second container + first container

            //If amount isnt bigger than second container
            //second container + first container
            //first container remove amounts that is transfered to container second
            if (UserCommand.equals("move")) {
                if (amount > first) {
                    second = second + first;
                } else {
                    second = second + amount;
                    first = first - amount;
                }
            }
            //If input is "remove"
            //And second container minus the amount is bigger or same as 0
            //second container minus amount
            if (UserCommand.equals("remove")) {
                if (second - amount >= 0) {
                    second = second - amount;
                }
            }
            //If second is bigger than 100 (full capacity)
            //second container is full and its at 100 (full capacity)
            if (second > 100) {
                second = 100;
            }
        }
    }

}
