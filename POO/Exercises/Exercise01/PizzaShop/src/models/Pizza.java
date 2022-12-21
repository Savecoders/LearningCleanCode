package models;

import java.util.Scanner;

public class Pizza {

    String name;
    int lenIngredients;
    String[] ingredients;
    float price;

    // constructor default
    public Pizza() {
        this.name = "";
        this.lenIngredients = 1;
    }

    // initial constructor in args

    public Pizza(String name, int lenIngredients) {
        this.name = name;
        this.lenIngredients = lenIngredients;
    }

    // gets and sets
    public String getName() {
        return name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPizzaDetails(Scanner Reader) {
        System.out.println("-----------------Pizza Menu--------------------");
        System.out.println("\t\u001B[31mPlease enter the next information\u001B[0m");
        System.out.println("-----------------------------------------------");

        // value of use the second constructor
        if (this.name.equals("") && lenIngredients <= 1) {
            System.out.print("Enter the name of pizza: ");
            this.name = Reader.nextLine();

            // eval the container of lenIngredients
            do {
                System.out.print("How to lengths of ingredients? : ");
                this.lenIngredients = Reader.nextInt();
                if (this.lenIngredients <= 1) {
                    System.out.println("The length to ingredients is zero or less");
                }
            } while (this.lenIngredients <= 1);
        }

        this.ingredients = new String[lenIngredients];

        for (int i = 0; i < lenIngredients; i++) {
            System.out.print("Enter the " + (i + 1) + " ingredient: ");
            ingredients[i] = Reader.next();
        }
    }

    public float getCalPrice() {
        this.price = this.lenIngredients > 2 ? 5 + (this.lenIngredients - 2) : 5;
        return this.price;
    }

    public void showPizzaDetails() {

        System.out.println("-----------------------------------------------");
        System.out.println("\u001B[31mShow details and info of the Pizza\u001B[0m");
        System.out.println("-----------------------------------------------");
        // details
        System.out.println("\t\u001B[33m⠀⣠⣤⣶⣶⣦⣄⣀\u001B[0m");
        System.out.println("\t\u001B[33m⢰⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀\u001B[0m\t" + "The name of Pizza is: " + this.name);
        System.out.println("\t\u001B[33m⢠⣷⣤⠀⠈⠙⢿⣿⣿⣿⣿⣿⣦⡀\u001B[0m\t" + "The len of ingredients is: " + this.lenIngredients);
        System.out.println("\t\u001B[33m⣠⣿⣿⣿⠆⠰⠶⠀⠘⢿⣿⣿⣿⣿⣿⣆\u001B[0m\t" + "The ingredients is");
        System.out.print("\t\u001B[33m⡜⠀⠀⠻⣿⣿⠿⣻⣥⣀⡀⢠⡟⠉\u001B[0m\t");

        // print of elements
        for (String ingredient :
                ingredients) {
            System.out.print(ingredient + ", ");
        }
        System.out.println("\n\t\u001B[33m⢰⠁⠀⡤⠖⠺⢶⡾⠃⠀⠀\u001B[0m\t" + "The price is: " + this.price + " $");
        System.out.println("\t\u001B[33m⠈⠓⠾⠇⠀⠀\u001B[0m");

    }

}
