package Offline3.Problem2;

public class Milk extends IngredientDecorator{
    public Milk(Coffee baseCoffee) {
        super(baseCoffee);
    }

    public String getIngredients() {
        return baseCoffee.getIngredients() + "\t\t\t Milk\n";
    }

    public int getCost() {
        return baseCoffee.getCost() + 50;
    }
}
