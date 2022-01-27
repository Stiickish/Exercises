package Stack;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author yelon
 */
public class Stack {

    //New ArrayList
    ArrayList<String> stacking = new ArrayList<>();

    //Checking wether or not the stack is empty
    public boolean isEmpty() {
        if (stacking.isEmpty()) {
            return true;
        }
        return false;
    }

    //Add a value to the stack
    public void add(String value) {
        stacking.add(value);
    }

    //Returns the value in the ArrayList
    public ArrayList<String> values() {

        return stacking;
    }
    //take a value from the stack. Remember it always take from the last index of the array.
    public String take() {
        return stacking.remove(stacking.size() - 1);
    }
}

