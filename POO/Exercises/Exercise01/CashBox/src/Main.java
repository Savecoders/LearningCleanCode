import model.Bill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        String quest;
        do {

            Bill cashBill = new Bill();

            cashBill.getBillDetails(rd);
            cashBill.getToPaly();
            cashBill.showBillDetails();

            System.out.println("-----------------------------------");
            System.out.println("\u001B[31mResponse yes or not: \u001B[0m");
            System.out.println("-----------------------------------");

            do {
                System.out.print("you can generate news bills? : ");

                quest = rd.next();
                quest = quest.toLowerCase();

                if(!(quest.equals("yes") || quest.equals("not"))){
                    System.out.println("\u001B[31mERROR not is (not or yes), please repeat\u001B[0m");
                }

            }while(!(quest.equals("yes") || quest.equals("not")));


            if(quest.equals("not")){
                cashBill.getDataOfBills();
            }else{
                System.out.println("\u001B[32mContinue\u001B[0m");
            }

        }while(quest.equals("yes"));
    }
}