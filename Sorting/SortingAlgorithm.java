package Sorting;

import java.util.Arrays;

public class SortingAlgorithm {

    public static void main(String[] args) {
        // write your test code here
        //int[] array = { 6, 5, 8, 7, 11};
        //System.out.println("Smallest: " + MainProgram.smallest(array));
        //int[] array = {-1, 6, 9, 8, 12};
        //System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        //System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
        //System.out.println(MainProgram.indexOfSmallestFrom(array, 1));

        //System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
        //int[] array = {3, 2, 5, 4, 8};
        //System.out.println(Arrays.toString(array));
        //MainProgram.swap(array, 1, 0);
        //System.out.println(Arrays.toString(array));
        //MainProgram.swap(array, 0, 3);
        //System.out.println(Arrays.toString(array));

        int[] array = {8, 3, 7, 9, 1, 2, 4};
        SortingAlgorithm.sort(array);
    }

    /*
    Create in the class MainProgram a class method "smallest" that takes
    an Integer array as a parameter. It should return the smallest value
    in the array.
     */
    public static int smallest(int[] array) {
        int smallestNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
            }
        }
        return smallestNumber;
    }

    /*
    Create a method called "indexOfSmallest" in the class MainProgram.
    It should return the index of the smallest number in the array
    that it receives as a parameter.
     */
    public static int indexOfSmallest(int[] array) {

        if (array.length == 0) {
            return -1;
        }
        int index = 0;
        int smallestNumber = array[index];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
                index = i;
            }
        }
        return index;
    }

    /*
    Create in the class MainProgram a class method called "indexOfSmallestFrom".
    It works similarly to the method in the pevious section, but only consider
    the table values from a certain index forwards. In the addition to the table
    it receives this start index as a parameter.
     */
    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int smallestFrom = table[startIndex];
        int index = 0;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] <= smallestFrom) {
                smallestFrom = table[i];
                index = i;
            }
        }
        return index;
    }

    /*
    Create a class method "swap" in the class MainProgram.
    It receives as its parameters an array and two indices inside it.
    The method swaps the numbers in these indicies with each other.
     */
    public static void swap(int[] array, int index1, int index2) {

        int tempSwap = array[index1];
        array[index1] = array[index2];
        array[index2] = tempSwap;

    }

    /*
    Implement a class method called "sort" based on the idea above in the class MainProgram.
    It should include a loop that goes through the indices of the array.
    Certainly the method "indexOfSmallestFrom" and "swap" will come in handy.
    Additionally, print the contents of the array before sorting and after every
    iteration of the loop to ensure that the algorithm works as you expect it to.
     */
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
}

