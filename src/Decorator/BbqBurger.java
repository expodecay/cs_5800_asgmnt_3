package Decorator;

public class BbqBurger extends Decorator {
    protected int bbq_burger_cost;
    protected int extra_toppings_cost = 1;

    public BbqBurger(FoodItem c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding BBQ Burger Features: Extra $" + extra_toppings_cost);
    }

    @Override
    public int getCost(){
        bbq_burger_cost = super.getCost() + extra_toppings_cost;
        //System.out.println("bbq_burger_cost: " + bbq_burger_cost);
        return bbq_burger_cost;
    }
}
