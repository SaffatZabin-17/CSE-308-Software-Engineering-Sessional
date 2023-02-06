package Offline2.Problem3;

public class DeliverProduct implements VendingMachineState{
    public VendingMachine vendingMachine;

    public DeliverProduct(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void inputMoney(int money) {
        System.out.println("Product Delivery ongoing. Please wait to order again.");
    }

    @Override
    public void deliverProduct() {
        vendingMachine.productCount--;
        System.out.println("Here's your product. Enjoy!!");
        System.out.println("Change output: " + (vendingMachine.getAmountInput()-vendingMachine.productPrice));
    }

    @Override
    public void noProduct() {
        System.out.println("It's not supposed to do that!!");
    }

    @Override
    public void notEnoughMoney() {
        if(vendingMachine.getAmountInput()-vendingMachine.productPrice < 0){
            System.out.println("Please input sufficient cash....");
            System.out.println("Cash required: " + (vendingMachine.productPrice-vendingMachine.getAmountInput()));
            vendingMachine.setCurrentState(vendingMachine.getNotEnoughMoney());
        }
    }

    @Override
    public void startState() {
        System.out.println("Vending Machine is already functional");
    }
}
