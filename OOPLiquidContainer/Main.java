package OOPLiquidContainer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) {

            System.out.println("First: " + containerOne);
            System.out.println("Second: " + containerTwo);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" "); //Splits at break
            String UserCommand = parts[0];  //Store it at index 0
            int amount = Integer.valueOf(parts[1]); //Parse the input to an Integer

            //If input is "add"
            //Add to containerOne
            if (UserCommand.equals("add")) {
                containerOne.add(amount);
            }

            //If input is "move"
            //ContainerTwo uses the method Math.min. It takes two parameters.
            //We input containerOne and what it contains and amount, so we can use those variables
            //We then remove the amount from containerOne (So we move from one to two.
            if (UserCommand.equals("move")) {
                containerTwo.add(Math.min(containerOne.contains(), amount));
                containerOne.remove(amount);
            }
            //If input is "remove"
            //Remove x amount from containerTwo
            if (UserCommand.equals("remove")) {
                containerTwo.remove(amount);
            }

        }
    }

}


