package Offline2.Problem3;

public class NotEnoughMoney implements VendingMachineState{

    public VendingMachine vendingMachine;

    public NotEnoughMoney(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void inputMoney(int money) {
        //System.out.println("Inside NotEnoughMoney class");
        vendingMachine.amountInput += money;
        if(vendingMachine.getAmountInput() >= vendingMachine.productPrice){
            vendingMachine.setCurrentState(vendingMachine.getDeliverProduct());
        }
        else {
            System.out.println("Not enough cash. Please input sufficient cash");
            System.out.println("Cash required: " + (vendingMachine.productPrice - vendingMachine.getAmountInput()));
            vendingMachine.setCurrentState(vendingMachine.getNotEnoughMoney());
        }
    }

    @Override
    public void deliverProduct() {
        System.out.println("Not enough cash. Please input sufficient cash");
    }

    @Override
    public void noProduct() {
        System.out.println("It's not supposed to do that!");
    }

    @Override
    public void notEnoughMoney() {
        vendingMachine.setCurrentState(vendingMachine.getNotEnoughMoney());
    }

    @Override
    public void startState() {
        System.out.println("Vending machine already started!!");
    }
}
