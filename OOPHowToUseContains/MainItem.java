package OOPHowToUseContains;


import java.util.ArrayList;
import java.util.Scanner;


public class MainItem {


    /*
    Part 1.
    The program should read items from the user. When all the items from the user
    have been read, the program prints the information of each item.

    For each item, its' identificer and name should be read. If the identificer
    or name is empty, the program stops asking for input, and prints
    all the item information.

    Part 2.
    Modify the program so that after entering the items, each item is printed
    at most once. Two items should be considered the same if their identifiers are
    the same (there can be variation in their names in different countries, for instance)

    If the user enters the same item multiple times, the print uses the item that was
    added first.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //For inputs
        ArrayList<Item> items = new ArrayList<>();  //New ArrayList of Item, called Items.
        //This is where we will store our inputs
        while (true) {  //While loop runs, until condition is met

            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) { //If empty input, stop
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {   //if empty input, stop
                break;
            }

            Item item = new Item(name, identifier); //Method calling. New instance of Item class

            if (items.contains(item)) {
                System.out.println("Item is already on the list");
            } else {
                items.add(item);    //Adding our inputs to the ArrayList
            }
        }
        System.out.println("==Items==");
        for (Item i : items) {  //For each loop, goes through our ArrayList and prints it all
            System.out.println(i);
        }
    }
}

