package Offline2.Problem1;

import java.util.ArrayList;

public class ServiceProvider implements Subject{

    ArrayList<Observer> premiumUsers;
    ArrayList<Observer> regularUsers;
    ArrayList<Observer> tempPremiumUsers;
    int previousServerState;
    int currentServerState;
    public ServiceProvider(){
        premiumUsers = new ArrayList<>();
        regularUsers = new ArrayList<>();
        tempPremiumUsers = new ArrayList<>();
        previousServerState = 2;
        currentServerState = 2;
    }
    public void setPreviousServerState(int previousServerState){
        this.previousServerState = previousServerState;
        //notifyPremiumUser();
        //notifyRegularUser();
    }
    public void setCurrentServerState(int currentServerState){
        System.out.println("!!!!!!!!!!!!!!!!!!Server status changed!!!!!!!!!!!!!!!!!!!!!!");
        setPreviousServerState(this.currentServerState);
        if(previousServerState == 0){
            System.out.println("Previous server status: Fully Offline");
        }
        if(previousServerState == 1){
            System.out.println("Previous server status: Partially Online");
        }
        if(previousServerState == 2){
            System.out.println("Previous server status: Fully Online");
        }
        this.currentServerState = currentServerState;
        if(currentServerState == 0){
            System.out.println("Current server status: Fully Offline");
        }
        if(currentServerState == 1){
            System.out.println("Current server status: Partially Online");
        }
        if(currentServerState == 2){
            System.out.println("Current server status: Fully Online");
        }
        System.out.println();
        notifyPremiumUser();
        System.out.println();
        notifyRegularUser();
    }
    @Override
    public void registerPremiumUser(Observer premiumUser) {
        premiumUsers.add(premiumUser);
    }
    @Override
    public void registerRegularUser(Observer regularUser) {
        regularUsers.add(regularUser);
    }

    @Override
    public void registerTempPremiumUser(Observer user) {
        tempPremiumUsers.add(user);
    }

    @Override
    public void unregisterTempPremiumUser(Observer user) {
        tempPremiumUsers.remove(user);
    }

    @Override
    public void unregisterRegularUser(Observer regularUser) {
        regularUsers.remove(regularUser);
    }

    @Override
    public void unregisterPremiumUser(Observer premiumUser) {
        premiumUsers.remove(premiumUser);
    }

    @Override
    public void notifyPremiumUser() {
        for(Observer o : premiumUsers){
            o.update();
        }
    }
    @Override
    public void notifyRegularUser() {
        for(Observer o : regularUsers){
            o.update();
        }
    }
}
