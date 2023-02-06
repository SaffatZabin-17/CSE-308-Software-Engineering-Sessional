package Offline2.Problem1;

import java.util.Scanner;

public class RegularUser implements Observer{
    int userID;
    boolean takePremiumService;
    public ServiceProvider serviceProvider;
    public RegularUser(ServiceProvider serviceProvider){
        this.serviceProvider = serviceProvider;
        this.userID++;
        serviceProvider.registerRegularUser(this);
        System.out.println("New Regular User: " + userID);
    }
    @Override
    public void update() {
        System.out.println("========================Update for all regular users...............========================");
        if(serviceProvider.previousServerState == 2 && serviceProvider.currentServerState == 1){
            System.out.println("Current ABC server is partially down. Service will be limited.");
            System.out.println("Would you use the limited functionality, or would you like to use the premium service for just $20 per hour?");
            System.out.println("Press 1 to use premium subscription for the time being. Press 0 to stay in current plan");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if(x == 1){
                takePremiumService = true;
            }
            else if(x == 0){
                takePremiumService = false;
            }
            else {
                takePremiumService = false;
                System.out.println("Invalid input");
            }
            if(takePremiumService){
                //serviceProvider.registerPremiumUser(this);
                serviceProvider.registerTempPremiumUser(this);
                //serviceProvider.unregisterRegularUser(this);
            }
        }
        if(serviceProvider.previousServerState == 2 && serviceProvider.currentServerState == 0){
            System.out.println("ABC server is fully down. Service will be offline");
            System.out.println("Would you use the limited functionality, or would you like to use the premium service for just $20 per hour?");
            System.out.println("Press 1 to use premium subscription for the time being. Press 0 to stay in current plan");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if(x == 1){
                takePremiumService = true;
            }
            else if(x == 0){
                takePremiumService = false;
            }
            else {
                takePremiumService = false;
                System.out.println("Invalid input");
            }
            if(takePremiumService){
                //serviceProvider.registerPremiumUser(this);
                //serviceProvider.unregisterRegularUser(this);
                serviceProvider.registerTempPremiumUser(this);
            }
        }
        if(serviceProvider.previousServerState == 1 && serviceProvider.currentServerState == 2){
            if(takePremiumService){
                int x = 10;
                System.out.println("ABC servers are fully operational. You have used the premium service for " + x + " hours");
                System.out.println("Total bill: " + x*20);
                serviceProvider.unregisterTempPremiumUser(this);
                //serviceProvider.unregisterPremiumUser(this);
                //serviceProvider.registerRegularUser(this);
            }
            else{
                System.out.println("ABC servers are fully operational.");
            }
        }
        if(serviceProvider.previousServerState == 1 && serviceProvider.currentServerState == 0){

        }
        if(serviceProvider.previousServerState == 0 && serviceProvider.currentServerState == 2){
            if(takePremiumService){
                int x = 10;
                System.out.println("ABC servers are fully operational. You have used the premium service for " + x + " hours");
                System.out.println("Total bill: " + x*20);
                serviceProvider.unregisterTempPremiumUser(this);
                //serviceProvider.unregisterPremiumUser(this);
                //serviceProvider.registerRegularUser(this);
            }
            else{
                System.out.println("ABC servers are fully operational.");
            }
        }
        if(serviceProvider.previousServerState == 0 && serviceProvider.currentServerState == 1){

        }
    }
}
