package OOPRecipeSearch;


import java.text.MessageFormat;
import java.util.ArrayList;

public class Recipes {

    //Declare private variables.
    //Name, cookTime and an ArrayList that holds all the ingredients
    //Also make a constructor for the variable to initialize them
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;

    public Recipes(String name, int cookTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getCookTime() {
        return cookTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.cookTime;

    }
}

