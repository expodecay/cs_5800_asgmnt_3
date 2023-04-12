package Decorator;

public class GarlicFries extends Decorator{
    protected int garlic_fries_cost;
    protected int extra_toppings_cost = 1;

    public GarlicFries(FoodItem c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding Garlic Fries Features: Extra $" + extra_toppings_cost);
    }

    @Override
    public int getCost(){
        garlic_fries_cost = super.getCost() + extra_toppings_cost;
        //System.out.println("bbq_burger_cost: " + bbq_burger_cost);
        return garlic_fries_cost;
    }
}
