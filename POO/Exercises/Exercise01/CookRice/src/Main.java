import models.CookingRecipe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);

        CookingRecipe spaghetti = new CookingRecipe();

        // details
        spaghetti.setRecipeDetails(rd);
        spaghetti.getCategory();
        spaghetti.showRecipeDetails();
    }
}