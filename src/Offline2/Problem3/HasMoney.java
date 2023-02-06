package Offline2.Problem3;

public class HasMoney implements VendingMachineState{

    VendingMachine vendingMachine;

    public HasMoney(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void inputMoney(int money) {
        System.out.println("Enough cash has been deposited. Please wait to order again");
    }

    @Override
    public void deliverProduct() {
        vendingMachine.setCurrentState(vendingMachine.getDeliverProduct());
        vendingMachine.productCount--;
        System.out.println("Product has been delivered. Enjoy!");
    }

    @Override
    public void noProduct() {
        System.out.println("Invalid operation. Vending Machine is out of order :)");
    }

    @Override
    public void notEnoughMoney() {
        System.out.println("Invalid operation. Vending Machine is out of order :)");
    }

    @Override
    public void startState() {
        System.out.println("Invalid operation. Vending Machine is out of order :)");
    }
}
