package BinaryAndLinearSearch;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    /*
    The linear search algorithm works by checking every value in a list or an array one at a time, starting from index 0.
    In the Main clas, implement a method "public static int linearSearch(ArrayList<Book>books, int searchedId)
    which searches the list it received as a parameter, for a book with an id variable that matches the value of searchedId
    variable it received as a parameter. If the book is found, the method, should return the index its located at in the list
    it received as a parameter. If the book isnt found, the method should return the value -1.
     */
    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int index = -1; //Variable int index
        for (int i = 0; i < books.size(); i++) { //For loop to go through the arrayList
            Book book = books.get(i);
            if (Objects.equals(book.getId(), searchedId)) { //If the book is found, return index.
                index = i; //Index can be either the index of the book or -1 depends on wether or not there is a book
            }
        }
        return index;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int first = 0;
        int last = books.size() - 1;
        int index = -1;

        while (first <= last) {
            int middle = (first + last) / 2;
            if (books.get(middle).getId() == searchedId) {
                index = middle;
                break;
            } else if (books.get(middle).getId() < searchedId) {
                first = middle + 1;
            } else if (books.get(middle).getId() > searchedId) {
                last = middle - 1;
            }
        }
        return index;
    }
}


