package Decorator;

public class BasicBurger implements FoodItem {
    private final int cost = 1;

    @Override
    public void assemble() {
        System.out.println("Basic Burger: $" + cost);
    }

    public int getCost(){
        return cost;
    }
}
