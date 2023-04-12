package Decorator;

public class VeggieBurger extends Decorator {
    protected int veggie_burger_cost;
    protected int extra_toppings_cost = 1;

    public VeggieBurger(FoodItem c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding Veggie Burger Features: Extra $" + extra_toppings_cost);
    }

    @Override
    public int getCost(){
        veggie_burger_cost = super.getCost() + extra_toppings_cost;
        //System.out.println("veggie_burger_cost: " + veggie_burger_cost);
        return veggie_burger_cost;
    }
}
