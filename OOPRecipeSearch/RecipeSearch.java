package OOPRecipeSearch;


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner for input

        RecipeBook book = new RecipeBook(); //New object of RecipeBook

        System.out.println("File to read: ");

        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) { //Try catch around file reading

            ArrayList<String> recipeLines = new ArrayList<>(); //ArrayList for the lines when reading

            while (fileScanner.hasNextLine()) { //While loop will keep looping aslong there is a line to read
                String line = fileScanner.nextLine();

                if (line.trim().isEmpty() || !fileScanner.hasNextLine()) { //If the line is empty or there is no more lines to read. Stop the program

                    String name = recipeLines.get(0); //puts the name in index 0 of the ArrayList

                    int time = Integer.valueOf(recipeLines.get(1)); //Puts the cooking time in index 1 of the ArrayList

                    ArrayList<String> ingredientsList = new ArrayList<>(); //ArrayList to keep the ingredients
                    for (int i = 2; i < recipeLines.size(); i++) { //Puts all the ingredients to the ingredientsList
                        ingredientsList.add(recipeLines.get(i));
                    }
                    book.addRecipes(new Recipes(name, time, ingredientsList)); //Creates an object and add it to the recipes book, which is an ArrayList of objects

                    recipeLines.clear();

                } else {
                    recipeLines.add(line);
                }

            }
            //Close the filescanner
            fileScanner.close();

        } catch (Exception e) {
            e.getMessage();
        }
        TextIo io = new TextIo(scanner, book);
        io.start();
    }

}

