package model;
import java.util.*;

public class Bill {

    String codeOfBill;
    String userName;
    String clientMail;
    String typeOfFlower;
    int lenOfSold;
    float totalToPay;

    public static int numberOfBill = 0;
    public static int totalBillPay = 0;

    private static String generateCode(){
        String[] snippets = new String[10];

        for (int i = 0; i < snippets.length ; i++) {
            snippets[i] =  Character.toString((char) ((int)(Math.random() * ((90 - 65) + 1)) + 65));
        }

        return String.join("", snippets);

    }

    public Bill(){
        this.codeOfBill = generateCode();
        this.lenOfSold = 1;
        Bill.numberOfBill++;
    }

    public Bill(String userName, String clientMail, int lenOfSold){

        // args basic of client
        this.codeOfBill = generateCode();
        Bill.numberOfBill++;
        this.userName = userName;
        this.clientMail = clientMail;
        this.lenOfSold = lenOfSold;
    }


    // gets and sets
    public void setTypeOfFlower(Scanner Reader) {
        // the selector query
        int select = 0;
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("\u001B[35mPlease selest the next category of the flower\u001B[0m ");
        System.out.println("----------------------------------------------------");

        // menu
        do{
            System.out.println("1. Small    | price $5.00");
            System.out.println("2. Middle   | price $8.00");
            System.out.println("3. Big      | price $13.00");
            System.out.println("-----------------------------");
            System.out.print("How select is? : ");
            select = Reader.nextInt();

            System.out.println((select<0 || select >4)
                    ? "\u001B[31mPlease repeat a select category\u001B[0m"
                    : "\u001B[32mIts Okay.\u001B[0m"
            );

        }while(select<0 || select >4);

        Map<Integer, String> types = new HashMap<>();
        types.put(1, "Small");
        types.put(2, "Middle");
        types.put(3, "Big");

        this.typeOfFlower = types.get(select);
    }

    public float getToPaly(){
        Map<String, Integer> dictionaryOfTypes = new HashMap<>();
        dictionaryOfTypes.put("Small", 5);
        dictionaryOfTypes.put("Middle", 8);
        dictionaryOfTypes.put("Big", 13);

        this.totalToPay = dictionaryOfTypes.get(this.typeOfFlower) * lenOfSold;
        Bill.totalBillPay+= totalToPay;
        return totalToPay;
    }


    public void getBillDetails(Scanner Reader){

        System.out.println("-------------------FLower Menu----------------------");
        System.out.println("\t\u001B[31mPlease enter the next information\u001B[0m");
        System.out.println("----------------------------------------------------");


        // enter basic date
        System.out.print("\u001B[34mEnter the you username: \u001B[0m");
        this.userName = Reader.next();
        System.out.print("\u001B[34mEnter the you mail: \u001B[0m");
        this.clientMail = Reader.next();

        // calculate of total pay
        System.out.print("\u001B[34mEnter the length flowers bouquets need: \u001B[0m");
        this.lenOfSold = Reader.nextInt();
        this.setTypeOfFlower(Reader);

    }

    public void getDataOfBills(){
        System.out.println("----------------------------------------------------");
        System.out.println("\u001B[31m     Show details of Total Bills \u001B[0m");
        System.out.println("----------------------------------------------------");
        System.out.println("The total number of bills is: "+ numberOfBill);
        System.out.println("Total value of pay bills is: "+ totalBillPay);
        System.out.println("----------------------------------------------------");
    }

    public void showBillDetails(){

        System.out.println("----------------------------------------------------");
        System.out.println("\u001B[31m       Show details of Bill \u001B[0m");
        System.out.println("----------------------------------------------------");


        // details
        //                  36 space after code
        System.out.println("The Code of Bill: "+ (" ".repeat(20)) + "| " + this.codeOfBill );
        System.out.println("The number of bill is: "+ (" ".repeat(15)) + "| " + numberOfBill);
        System.out.println("The username is: "+ (" ".repeat(21)) + "| " + this.userName);
        System.out.println("The mail is: "+ (" ".repeat(25)) + "| " + this.clientMail);
        System.out.println("The number of flower bouquets is: "+ (" ".repeat(4)) + "| " + this.lenOfSold);
        System.out.println("The type of flower is: "+ (" ".repeat(15)) + "| " + this.typeOfFlower);
        System.out.println("----------------------------------------------------");
        System.out.println("\u001B[33mTotal of Pay is: \u001B[0m"+this.totalToPay + "$");

    }

}
