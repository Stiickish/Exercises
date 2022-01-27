package OOPCargoHold;

public class Item {

/*
Create an Item class from which objects can be instantiated to represent different items.
The information to store is the name and weight of the item (kg)
Add the following methods to the class:

Constructor that takes the name and weight of the item as parameters
Method public String getName() ewhich returns the item's name
Method public int getWeight() which returns the item's weight
Method public String toString() which returns the string "name (weight kg)"
 */

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return name + " (" + weight + "kg)";
    }
}
