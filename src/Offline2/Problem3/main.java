package Offline2.Problem3;

import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Welcome to XYZ Vending Machine!!!");

        Scanner sc = new Scanner(System.in);
        int productCount = 1;

        while(true){
            VendingMachine vendingMachine = new VendingMachine(productCount);
            System.out.println("Would you like to order a product? ^_^ If so, press 1, else press 2");
            int string;
            string = sc.nextInt();
            if(string == 1){
                System.out.println("Checking the amount of available products.......");
                if(vendingMachine.productCount > 0){
                    System.out.println("Yay! We have enough products for your service!");
                }
                else{
                    System.out.println("Vending Machine doesn't have enough product :( Please refill again");
                    System.out.print("Refill amount: ");
                    int amount = sc.nextInt();
                    productCount = amount;
                    vendingMachine.setProductCount(amount);
                }
                System.out.println();
                System.out.print("The product is 50 BDT. Please input 50 BDT: ");
                int amount = 0, temp = 0;
                while(temp < vendingMachine.productPrice){
                    amount = sc.nextInt();
                    vendingMachine.inputMoney(amount);
                    temp += amount;
                }
                vendingMachine.deliverProduct();
                productCount--;
            }
            else if(string == 2){
                System.out.println("Until next time. Bye!");
                break;
            }
            else{
                System.out.println("Invalid Command >_<");
            }
        }
    }
}
