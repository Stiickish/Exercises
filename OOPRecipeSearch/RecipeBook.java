package OOPRecipeSearch;


import java.util.ArrayList;

//This class is made to handle all the recipes. We use an ArrayList to do this
public class RecipeBook {

    private ArrayList<Recipes> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    //Void method addRecipes, takes Recipes in as parameter.
    //Here we add the recipes to the ArrayList
    public void addRecipes(Recipes recipes) {
        this.recipes.add(recipes);
    }

    //We make a void method to print a recipe by its name. It takes String name as parameter
    //If the ArrayList is empty, it prints "No recipes found"
    //If the list isn't empty and contains our input, it prints out the recipe
    //Use a for each loop to loop through the ArrayList. Use keyword "contains" to see if the list have that word input
    public void printRecipesByName(String name) {
        if (this.recipes.isEmpty()) {
            System.out.println("No recipes found");
        } else {
            for (Recipes r : this.recipes) {
                if (r.getName().contains(name)) {
                    System.out.println(r);
                }
            }
        }
    }

    //We make a void method to print a recipe by its cooking time. It takes a String time as parameter
    //If the ArrayList is empty, it prints "No recipes found"
    //Use a for each loop to loop through our ArrayList of recipes
    //parsing our Integer time to a String
    //If there is any recipes with a cook time less than our input, then print that recipe
    public void printRecipeByTime(String time) {
        if (this.recipes.isEmpty()) {
            System.out.println("No recipes found");
        } else {
            for (Recipes r : this.recipes) {
                if (r.getCookTime() <= Integer.valueOf(time)) {
                    System.out.println(r);
                }
            }
        }
    }

    //We make a void method to print a recipe by its ingredients. It takes a String ingredients as parameter
    //If the ArrayList is empty, it prints "No recipes found"
    //Use a for each loop to loop though the ArrayList
    //If our ArrayList have a recipe that contains our user input, print that recipe
    public void printRecipeByIngredients(String ingredient) {

        if (this.recipes.isEmpty()) {
            System.out.println("No recipes found");
        } else {
            for (Recipes r : this.recipes) {
                if (r.getIngredients().contains(ingredient)) {
                    System.out.println(r);
                }
            }
        }
    }

    //Method to print our entire recipe book
    public void printRecipeBook() {
        for (Recipes r : this.recipes) {
            System.out.println(r);
        }
    }

}
