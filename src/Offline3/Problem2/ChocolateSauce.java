package Offline3.Problem2;

public class ChocolateSauce extends IngredientDecorator{
    public ChocolateSauce(Coffee baseCoffee) {
        super(baseCoffee);
    }

    public String getIngredients() {
        return baseCoffee.getIngredients() + "\t\t\t Chocolate Sauce\n";
    }

    public int getCost() {
        return baseCoffee.getCost() + 60;
    }
}
