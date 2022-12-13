import model.Drinks;

public class Main {
    public static void main(String[] args) {
        System.out.println("My name is: Pablo Pincay.");

        // initialize class Drinks

        Drinks drinkOne = new Drinks();
        drinkOne.getDetails();

        // using second constructor
        Drinks drinkArgs = new Drinks("Pepsi", "cola", 24, false);
        drinkArgs.getDetails();


    }
}