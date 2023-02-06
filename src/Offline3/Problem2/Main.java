package Offline3.Problem2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to কফির টং! Please have a look at the menu and order away! ");
        ArrayList<Coffee> coffees = new ArrayList<>();
        ArrayList<String> coffeeNames = new ArrayList<>();
        System.out.println();
        int option;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Menu: ");
            System.out.println("\t\t1. Americano");
            System.out.println("\t\t2. Espresso");
            System.out.println("\t\t3. Cappuccino");
            System.out.println("\t\t4. Mocha");
            System.out.println("Please input the name of coffee you want");
            String name = scanner.next();
            if(name.equalsIgnoreCase("Americano")){
                coffees.add(new GroundCoffeeBeans(new BlackCoffee()));
                coffeeNames.add("Americano");
            }
            else if(name.equalsIgnoreCase("Espresso")){
                coffees.add(new DairyCream(new BlackCoffee()));
                coffeeNames.add("Espresso");
            }
            else if(name.equalsIgnoreCase("Cappuccino")){
                coffees.add(new CinnamonPowder(new Milk(new BlackCoffee())));
                coffeeNames.add("Cappuccino");
            }
            else if(name.equalsIgnoreCase("Mocha")){
                coffees.add(new ChocolateSauce(new Milk(new BlackCoffee())));
                coffeeNames.add("Mocha");
            }
            System.out.println("Would you like to order more? Press Y to order more, Press N to go to checkout");
            name = scanner.next();
            if(name.equalsIgnoreCase("N")){
                break;
            }
            else if(!name.equalsIgnoreCase("Y")){
                System.out.println("Invalid input");
            }
        }
        for(int i=0;i<coffees.size();i++){
            System.out.println("==========================================");
            System.out.println("Order " + (i+1) + ": " + coffeeNames.get(i));
            System.out.println(" ");
            System.out.println(coffees.get(i).getIngredients());
            System.out.print("Price: ");
            System.out.println(coffees.get(i).getCost() + 100);
            System.out.println("==========================================");
        }
    }
}
