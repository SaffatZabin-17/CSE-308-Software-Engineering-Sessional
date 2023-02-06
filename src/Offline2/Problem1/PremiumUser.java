package Offline2.Problem1;

public class PremiumUser implements Observer{
    int userID;
    public ServiceProvider serviceProvider;
    public PremiumUser(ServiceProvider serviceProvider){
        this.serviceProvider = serviceProvider;
        this.userID++;
        serviceProvider.registerPremiumUser(this);
        System.out.println("New Premium User: " + this.userID);
    }
    @Override
    public void update() {
        System.out.println("========================Update for all Premium Users..............========================");
        if(serviceProvider.previousServerState == 2 && serviceProvider.currentServerState == 1){
            System.out.println("ABC servers are currently undergoing a minor issue. So servers are partially operational.");
            System.out.println("Fortunately your premium subscription plan covers server outage. You will be redirected to DEF server based on your response");
            System.out.println("Would you like to use partial services of both ABC and DEF servers? or would you like to use full functionality of DEF servers?");
        }
        if(serviceProvider.previousServerState == 2 && serviceProvider.currentServerState == 0){
            System.out.println("ABC servers are now offline. As per your premium subscription plan, you will be redirected to DEF servers");
        }
        if(serviceProvider.previousServerState == 1 && serviceProvider.currentServerState == 2){
            System.out.println("ABC servers are now fully online");
        }
        if(serviceProvider.previousServerState == 1 && serviceProvider.currentServerState == 0){
            System.out.println("ABC servers are now offline. As per your premium subscription plan, you will be redirected to DEF servers");
        }
        if(serviceProvider.previousServerState == 0 && serviceProvider.currentServerState == 2){
            System.out.println("ABC servers are now fully online");
        }
        if(serviceProvider.previousServerState == 0 && serviceProvider.currentServerState == 1){

        }
    }
}
