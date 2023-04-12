package Decorator;

public class CheeseBurger extends Decorator {
    protected int cheese_burger_cost;
    protected int extra_toppings_cost = 1;

    public CheeseBurger(FoodItem c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding Cheese Burger Features: Extra $" + extra_toppings_cost);
    }

    @Override
    public int getCost(){
        cheese_burger_cost = super.getCost() + extra_toppings_cost;
        //System.out.println("cheese_burger_cost...: " + cheese_burger_cost);
        return cheese_burger_cost;
    }
}
