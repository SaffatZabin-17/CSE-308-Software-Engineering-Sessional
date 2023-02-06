package Offline3.Problem2;

public class GroundCoffeeBeans extends IngredientDecorator{
    public GroundCoffeeBeans(Coffee baseCoffee) {
        super(baseCoffee);
    }

    public String getIngredients() {
        return baseCoffee.getIngredients() + "\t\t\t Ground Coffee Beans\n";
    }

    public int getCost() {
        return baseCoffee.getCost() + 30;
    }
}
