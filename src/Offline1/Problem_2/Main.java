package Offline1.Problem_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String continent;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the XYZ Auto Shop!");
        System.out.print("Please enter your geographical location: ");
        continent = sc.nextLine();
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar(continent);
        car.returnCar();
    }
}
