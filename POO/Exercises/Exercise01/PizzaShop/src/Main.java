import models.Pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        // normal pizza
        Pizza pizzaNormal = new Pizza();

        // details
        pizzaNormal.setPizzaDetails(rd);
        pizzaNormal.getCalPrice();
        pizzaNormal.showPizzaDetails();

    }
}