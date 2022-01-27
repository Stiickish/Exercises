package OOPHowToUseContains;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBook {

    public static void main(String[] args) {
        //Scanner for inputs
        Scanner scanner = new Scanner(System.in);

        //New ArrayList of Book, named books.
        ArrayList<Book> books = new ArrayList<>();

        //While loop, stops when condition is met
        while (true) {
            //Ask our user for book name
            System.out.println("Name (empty will stop):");

            //Users input in console
            String name = scanner.nextLine();

            //If input is empty, program stops
            if (name.isEmpty()) {
                break;
            }
            //Ask the user for a year
            System.out.println("Publication year:");

            //Users input in console
            int publicationYear = Integer.valueOf(scanner.nextLine());

            //New instance of Book class.
            Book book = new Book(name, publicationYear);

            //If arrayList have a book called x, then print
            if (books.contains(book)) {
                System.out.println("The book is already on the list. Let's not add the same book again");

                //If the book is not in ArrayList already, add it.
            } else {
                books.add(book);
            }

        }

        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}

