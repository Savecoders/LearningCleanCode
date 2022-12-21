package models;

import java.util.Scanner;

public class CookingRecipe {

    String nameOfRicipe;
    int lenIngredients;
    String[] ingredients;
    String category;
    int timeOfPreparate;

    public CookingRecipe() {
        this.nameOfRicipe = "";
        this.lenIngredients = 5;
    }

    // initial constructor in args

    public CookingRecipe(String nameOfRicipe, int lenIngredients, int timeOfPreparate) {
        this.nameOfRicipe = nameOfRicipe;
        this.lenIngredients = lenIngredients;
        this.timeOfPreparate = timeOfPreparate;
    }

    public String getCategory() {

        if (lenIngredients >= 5 & lenIngredients <= 10) {
            this.category = "Middle";
        } else if (lenIngredients > 10) {
            this.category = "Hard";
        } else {
            this.category = "Easy";
        }

        return this.category;
    }

    public void setRecipeDetails(Scanner Reader) {

        System.out.println("-----------------Pizza Menu--------------------");
        System.out.println("\t\u001B[31mPlease enter the next information\u001B[0m");
        System.out.println("-----------------------------------------------");

        // value of use the second constructor
        System.out.print("Enter the name of Cook: ");
        this.nameOfRicipe = Reader.nextLine();

        // eval the container of lenIngredients
        do {
            System.out.print("How to lengths of ingredients? : ");
            this.lenIngredients = Reader.nextInt();
            if (this.lenIngredients <= 1) {
                System.out.println("The length to ingredients is zero or less");
            }
        } while (this.lenIngredients <= 1);

        this.ingredients = new String[lenIngredients];

        for (int i = 0; i < lenIngredients; i++) {
            System.out.print("Enter the of "+this.nameOfRicipe+" " + (i + 1) + ". ingredient: ");
            ingredients[i] = Reader.next();
        }

        System.out.print("Enter the time of preparate the "+this.nameOfRicipe+" in seconds: ");
        this.timeOfPreparate = Reader.nextInt();
    }

    public void showRecipeDetails() {

        System.out.println("-----------------------------------------------");
        System.out.println("\u001B[31mShow details and info of the Cook\u001B[0m");
        System.out.println("-----------------------------------------------");
        // details
        System.out.println("\t\u001B[33m⠀⢀⣠⣤⣤⣤⣾⣿⣿⣿⣿⣷⣶⣶⣦⡄ \u001B[0m");
        System.out.println("\t\u001B[33m ⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷ \u001B[0m\t" + "The name of recipe is: " + this.nameOfRicipe);
        System.out.println("\t\u001B[33m ⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃ \u001B[0m\t" + "The len of ingredients is: " + this.lenIngredients);
        System.out.println("\t\u001B[33m  ⠙⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿   \u001B[0m\t" + "The ingredients is");
        System.out.print("\t\u001B[33m ⠀⠀  ⣿⡿⠿⠿⠿⠿⠿⠿⢿⣿   \u001B[0m\t");

        // print of elements
        for (String ingredient :
                ingredients) {
            System.out.print(ingredient + ", ");
        }
        System.out.println("\n\t\u001B[33m      ⣤⣴⣶⣶⣶⣶⣦⣤⡄⠀⠀\u001B[0m\t" + "The category is: " + this.category);
        System.out.println("\t\u001B[33m       ⢸⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀\u001B[0m\t" + "The time of cooking is: " + this.timeOfPreparate +" seconds");
        System.out.println("\t\u001B[33m        ⢿⣿⣿⣿⣿⣿⣿⡿⠀⠀\u001B[0m\t");

    }

}
