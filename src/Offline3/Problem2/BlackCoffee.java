package Offline3.Problem2;

public class BlackCoffee implements Coffee{
    @Override
    public String getIngredients() {
        return "Ingredients: Water\n\t\t\t Ground Coffee Beans\n";
    }
    @Override
    public int getCost() {
        return 30;
    }
}
