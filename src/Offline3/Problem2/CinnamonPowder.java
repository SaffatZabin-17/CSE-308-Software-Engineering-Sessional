package Offline3.Problem2;

public class CinnamonPowder extends IngredientDecorator{
    public CinnamonPowder(Coffee baseCoffee) {
        super(baseCoffee);
    }

    public String getIngredients() {
        return baseCoffee.getIngredients() + "\t\t\t Cinnamon Powder\n";
    }

    public int getCost() {
        return baseCoffee.getCost() + 50;
    }
}
