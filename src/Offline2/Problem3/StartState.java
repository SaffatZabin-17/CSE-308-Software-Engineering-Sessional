package Offline2.Problem3;

public class StartState implements VendingMachineState{
    VendingMachine vendingMachine;

    public StartState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void inputMoney(int money) {
        if(vendingMachine.getProductCount() <= 0){
            vendingMachine.setCurrentState(vendingMachine.getNoProduct());
            return;
        }
        if(money >= vendingMachine.getProductPrice()){
            vendingMachine.amountInput += money;
            vendingMachine.setCurrentState(vendingMachine.getDeliverProduct());
        }
        else {
            vendingMachine.amountInput += money;
            System.out.println("Not enough cash. Please input sufficient cash");
            System.out.println("Cash required: " + (vendingMachine.productPrice - vendingMachine.getAmountInput()));
            vendingMachine.setCurrentState(vendingMachine.getNotEnoughMoney());
        }
    }

    @Override
    public void deliverProduct() {
        System.out.println("Please input cash before proceeding");
    }

    @Override
    public void noProduct() {
        if(vendingMachine.getProductCount() <= 0){
            vendingMachine.setCurrentState(vendingMachine.getNoProduct());
            System.out.println("No product in the vending machine");
        }
    }

    @Override
    public void notEnoughMoney() {
        vendingMachine.setCurrentState(vendingMachine.getNotEnoughMoney());
    }

    @Override
    public void startState() {
        System.out.println("Welcome to XYZ Vending Machine!!");
    }
}
