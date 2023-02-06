package Offline3.Problem2;

public class DairyCream extends IngredientDecorator{
    public DairyCream(Coffee baseCoffee) {
        super(baseCoffee);
    }

    public String getIngredients() {
        return baseCoffee.getIngredients() + "\t\t\t Dairy Cream\n";
    }

    public int getCost() {
        return baseCoffee.getCost() + 40;
    }
}
