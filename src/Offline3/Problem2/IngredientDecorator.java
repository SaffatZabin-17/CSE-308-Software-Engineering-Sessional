package Offline3.Problem2;

public class IngredientDecorator implements Coffee{
    protected Coffee baseCoffee;

    public IngredientDecorator(Coffee baseCoffee){
        this.baseCoffee = baseCoffee;
    }
    @Override
    public String getIngredients() {
        return baseCoffee.getIngredients();
    }

    @Override
    public int getCost() {
        return baseCoffee.getCost();
    }
}
