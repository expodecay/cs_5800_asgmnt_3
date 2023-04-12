package Decorator;

public class Decorator implements FoodItem {

    protected FoodItem burger;
    protected int cost = 0;

    public Decorator(FoodItem c){
        this.burger = c;
    }

    @Override
    public void assemble() {
        this.burger.assemble();
    }

    @Override
    public int getCost() {
        return cost + burger.getCost();
    }
}
