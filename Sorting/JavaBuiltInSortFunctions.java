package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class JavaBuiltInSortFunctions {


    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(3);
        numbers.add(7);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        ArrayList<String> words = new ArrayList<>();
        words.add("Zebra");
        words.add("Bee");
        words.add("Hello");
        words.add("Idiot");
        words.add("Apple");
        System.out.println(words);
        Collections.sort(words);
        System.out.println(words);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);

    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}


