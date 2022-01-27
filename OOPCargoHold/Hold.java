package OOPCargoHold;

import java.util.ArrayList;

public class Hold {

/*
Make a Hold class with the following methods:

A constructor to which the maximum weight is given
A method public void addSuitcase(Suitcase suitcase) that adds the specified luggage to the hold
A method public String toString that returns the string "x suitcases (y kg)"

Store your suitcases in a suitable ArrayList structure.

The class Hold has to ensure that the total weight of the suitcases it contains does not exceed the maximum weight.
Should the maximum weight be exceeded due to the addition of new luggage,
the addSuitcase method should not add the new suitcase.

Add to the Hold class the method public void printItems() that prints all the items contained in the hold's suitcases.
 */

    private int maxWeight;
    private ArrayList<Suitcase> list;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<Suitcase>();

    }

    public int totalWeightOfSuitcases() {
        int weight = 0;

        for (Suitcase sc : list) {
            weight = weight + sc.totalWeight();
        }
        return weight;
    }

    public void printItems() {
        for (Suitcase sc : list) {
            sc.printItems();
        }
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeightOfSuitcases() + suitcase.totalWeight() <= maxWeight) {
            list.add(suitcase);
        } else {
            return;
        }

    }

    public String toString() {

        String weightOutput = "(" + totalWeightOfSuitcases() + "kg)";
        String suitcaseOutput = "";

        if (list.isEmpty()) {
            suitcaseOutput = "no suitcases";
        } else if (list.size() == 1) {
            suitcaseOutput = "1 suitcase";
        } else {
            suitcaseOutput = list.size() + " suitcases";
        }
        return suitcaseOutput + weightOutput;
    }

}

