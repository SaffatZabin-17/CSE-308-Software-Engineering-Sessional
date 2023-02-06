package Offline2.Problem3;

public interface VendingMachineState {
    void inputMoney(int money);
    void deliverProduct();
    void noProduct();
    void notEnoughMoney();

    void startState();
}
