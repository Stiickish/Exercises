package OOPItem;

import OOPItem.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    /*
    Write a program that reads names of items from the user. If the name is
    empty, the program stops reading. Otherwise, the given name is used to create a new
    item, which you will then add to the "items" list.

    Having read all the names,print all the items by using the "toString" method of the Item
    class. The implementation of the "Item" class keeps track of the time of creation, in
    addition to the name of the item.
     */
    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();  //ArrayList to store items
        Scanner scanner = new Scanner(System.in);   //Scanner for inputs in the console

        while (true) {  //While loop runs until condition is met
            String inputs = scanner.nextLine(); //So user can write in console
            if (inputs.equals("")) {    //If input is empty
                break;  //Stop the program/And create a new item
            }
            Item item = new Item(inputs); //Makes a new item of the input
            items.add(item); //Adds the item to the array list of items
        }

        //Makes a for each loop to iterate the arrayList
        //The first spot is the ArrayLists (Item) second is just a name, we could have called it i
        //Third is the ArrayLists name which is items. We are iterating through the ArrayList
        //And all the objects in that list
        for (Item item : items) {
            System.out.println(item.toString()); //Prints the list with the toString method
        }
    }

}

