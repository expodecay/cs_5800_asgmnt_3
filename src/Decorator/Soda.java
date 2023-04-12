package Decorator;

public class Soda extends Decorator{
    protected int soda_cost;
    protected int extra_toppings_cost = 1;

    public Soda(FoodItem c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding Soda Features: Extra $" + extra_toppings_cost);
    }

    @Override
    public int getCost(){
        soda_cost = super.getCost() + extra_toppings_cost;
        //System.out.println("bbq_burger_cost: " + bbq_burger_cost);
        return soda_cost;
    }
}
