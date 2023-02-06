package Offline2.Problem3;

public class VendingMachine {
    VendingMachineState hasMoney;
    VendingMachineState deliverProduct;
    VendingMachineState noProduct;
    VendingMachineState notEnoughMoney;
    VendingMachineState startState;
    VendingMachineState currentState;

    int productCount = 1;

    int productPrice = 50;

    int amountInput;
    boolean inputEnoughMoney;

    public VendingMachine(int productCount){
        hasMoney = new HasMoney(this);
        deliverProduct = new DeliverProduct(this);
        noProduct = new NoProduct(this);
        notEnoughMoney = new NotEnoughMoney(this);
        startState = new StartState(this);
        inputEnoughMoney = false;
        currentState = startState;
        if(productCount <= 0){
            startState = noProduct;
        }
        this.productCount = productCount;
    }

    public void setCurrentState(VendingMachineState vendingMachineState){
        this.currentState = vendingMachineState;
    }
    public void setProductCount(int productCount){
        this.productCount = productCount;
    }
    public void setAmountInput(int amountInput){
        this.amountInput = amountInput;
    }
    public int getProductPrice(){
        return this.productPrice;
    }
    public int getProductCount(){
        return this.productCount;
    }
    public int getAmountInput(){
        return this.amountInput;
    }
    public void inputMoney(int money){
        currentState.inputMoney(money);
    }
    public void deliverProduct(){
        currentState.deliverProduct();
    }
    public void noProduct(){
        currentState.noProduct();
    }
    public void notEnoughMoney(){
        currentState.notEnoughMoney();
    }
    public void startState(){
        currentState.startState();
    }
    public VendingMachineState getHasMoney(){
        return this.hasMoney;
    }
    public VendingMachineState getDeliverProduct(){
        return this.deliverProduct;
    }
    public VendingMachineState getNoProduct(){
        return this.noProduct;
    }
    public VendingMachineState getNotEnoughMoney(){
        return this.notEnoughMoney;
    }
    public VendingMachineState getStartState(){
        return this.startState;
    }
}
