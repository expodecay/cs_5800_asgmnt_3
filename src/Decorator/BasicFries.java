package Decorator;

public class BasicFries implements FoodItem{
    private final int cost = 1;

    @Override
    public void assemble() {
        System.out.println("Basic Fries: $" + cost);
    }

    @Override
    public int getCost() {
        return cost;
    }
}
