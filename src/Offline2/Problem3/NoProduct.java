package Offline2.Problem3;

public class NoProduct implements VendingMachineState{

    VendingMachine vendingMachine;
    public NoProduct(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void inputMoney(int money) {
        System.out.println("Not enough product in Vending Machine. Please check at a later time :)");
    }

    @Override
    public void deliverProduct() {
        System.out.println("Not enough product in Vending Machine. Please check at a later time :)");
    }

    @Override
    public void noProduct() {
        System.out.println("Not enough product in Vending Machine. Please check at a later time :)");
    }

    @Override
    public void notEnoughMoney() {
        System.out.println("Not enough product in Vending Machine. Please check at a later time :)");
    }

    @Override
    public void startState() {
        System.out.println("Not enough product in Vending Machine. Please check at a later time :)");
    }
}
