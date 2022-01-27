package OOPBook;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBook {


    public static void main(String[] args) {
        //New arraylist of book, with books

        ArrayList<Book> books = new ArrayList<>();
        // implement here the program that allows the user to enter
        // book information and to examine them

        //scanner for inputs

        Scanner scanner = new Scanner(System.in);

        //While loop

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) { //If empty input, stop.
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            //Add title, pages and publicationyear to arraylist

            books.add(new Book(title, pages, publicationYear));

        }
        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();

        //run through arraylist

        for (Book book : books) {
            if (input.equals("everything")) {
                System.out.println(book.toString()); //print toString method
            } else if (input.equals("name")) {
                System.out.println(book.getName()); //print getName method
            }
        }
    }
}