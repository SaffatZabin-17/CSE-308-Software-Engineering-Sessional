package Offline2.Problem1;

public class main {
    public static void main(String[] args) {
        ServiceProvider serviceProvider = new ServiceProvider();
        PremiumUser premiumUser = new PremiumUser(serviceProvider);
        //PremiumUser premiumUser1 = new PremiumUser(serviceProvider);
        RegularUser regularUser = new RegularUser(serviceProvider);

        serviceProvider.setCurrentServerState(0);
        serviceProvider.setCurrentServerState(2);
        serviceProvider.setCurrentServerState(1);
    }
}
