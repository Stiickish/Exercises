package OOPCargoHold;

import java.util.ArrayList;

public class Suitcase {

    /*
    Create a Suitcase class. The suitcase has items and a maximum weight that
    determines the maximum total weight of the items.
    Add the following methods to the class:

    Constructor to which the maximum weight is provided
    The method public void addItem(Item item) which adds the item passed as a parameter to the suitcase. The method is void
    The method public String toString() which returns the string "x items (y kg)"

    Add the following methods to the Suitcase class:

    A printItems method which prints all the items in the suitcase
    A totalweight method which returns the total weight of the items

    Add to the Suitcase class a heaviestItem method which returns the largest item based on weight.
    If several items share the heaviest weight, the method can rturn any of them. The method should
    return an object reference. If the suitcase is empty, return the value null
     */

    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;

    }

    //Making a new method, to calculate the totalWeight
    public int totalWeight() {

        //Weight is 0 at default
        int weight = 0;

        //Going through the ArrayList
        //Sets the weight to weight + Item object weight
        for (Item i : items) {
            weight = weight + i.getWeight();
        }
        //Returns the weight
        return weight;
    }

    //Add item method
    public void addItem(Item item) {

        //If totalWeight method + item object weight
        //is less than our variable maxWeight, then add items.
        //Otherwise do nothing
        if (totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    //Print items method
    public void printItems() {

        //For each loop, going through the ArrayList
        for (Item i : items) {
            System.out.println(i);
        }

    }

    //Heaviest item method
    public Item heaviestItem() {

        //If the list is empty, return null
        if (items.isEmpty()) {
            return null;
        }
        //Item object where we get index 0 at ArrayList
        Item heaviestItem = items.get(0);

        //For each loop going through the ArrayList
        for (Item i : items) {
            if (i.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = i;
            }

        }
        return heaviestItem;
    }

    public String toString() {

        //Making to new variables to hold our output
        String weightOutput = " (" + totalWeight() + "kg)";
        String itemOutput = "";

        //If ArrayList is empty, output is no items
        if (items.isEmpty()) {
            itemOutput = "no items";

            //If there is 1 item in the list, output is 1
        } else if (items.size() == 1) {
            itemOutput = "1 item";

            //If there is more than 1 item in the list
            //output will be displayed as ArrayList size
        } else {
            itemOutput = items.size() + " items";
        }
        //We return both output
        return itemOutput + weightOutput;
    }
}

