package Decorator;

public class BasicDrink implements FoodItem{
    private final int cost = 0;

    @Override
    public void assemble() {
        System.out.println("Water Cup: $" + cost);
    }

    @Override
    public int getCost() {
        return cost;
    }
}
