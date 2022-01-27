package OOPRecipeSearch;


import java.util.Scanner;


public class TextIo {

    private Scanner scanner;
    private RecipeBook book;

    public TextIo(Scanner scanner, RecipeBook book) {
        this.scanner = scanner;
        this.book = book;
    }

    public void start() {
        System.out.println("Commands:" + "\n"
                + "list - lists the recipes " + "\n"
                + "stop - stops the program " + "\n"
                + "find name - searches recipes by name" + "\n"
                + "find cooking time -searches recipes by cooking time" + "\n"
                + "find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("Enter command: ");
            String input = scanner.nextLine();

            if (input.equals("list")) {
                System.out.println("Recipes: ");
                book.printRecipeBook();

            } else if (input.equals("stop")) {
                break;

            } else if (input.equals("find name")) {
                System.out.println("Search word: ");
                String searchWord = scanner.nextLine();
                book.printRecipesByName(searchWord);

            } else if (input.equals("find cooking time")) {
                System.out.println("Search word: ");
                String searchWord = scanner.nextLine();
                book.printRecipeByTime(searchWord);

            } else if (input.equals("find ingredient")) {
                System.out.println("Search word: ");
                String searchWord = scanner.nextLine();
                book.printRecipeByIngredients(searchWord);

            } else {
                System.out.println("Unknown command, try again please");
            }

        }
    }
}
