package Decorator;

public class AnimalFries extends Decorator{
    protected int animal_fries_cost;
    protected int extra_toppings_cost = 1;

    public AnimalFries(FoodItem c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding Animal Fries Features: Extra $" + extra_toppings_cost);
    }

    @Override
    public int getCost(){
        animal_fries_cost = super.getCost() + extra_toppings_cost;
        //System.out.println("bbq_burger_cost: " + bbq_burger_cost);
        return animal_fries_cost;
    }
}
