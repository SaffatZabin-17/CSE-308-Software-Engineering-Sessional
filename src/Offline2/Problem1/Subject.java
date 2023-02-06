package Offline2.Problem1;

public interface Subject {
    void registerPremiumUser(Observer premiumUser);
    void registerRegularUser(Observer regularUser);
    void registerTempPremiumUser(Observer user);
    void unregisterTempPremiumUser(Observer user);
    void unregisterRegularUser(Observer regularUser);
    void unregisterPremiumUser(Observer premiumUser);
    void notifyPremiumUser();
    void notifyRegularUser();
}
