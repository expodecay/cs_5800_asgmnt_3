package Decorator;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        FoodItem basic_burger = new BasicBurger();
        FoodItem bbq_burger = new BbqBurger(new BasicBurger());
        FoodItem veggie_burger = new VeggieBurger(new BasicBurger());
        FoodItem bbq_cheese_burger = new CheeseBurger(new BbqBurger(new BasicBurger()));
        FoodItem animal_garlic_fries = new AnimalFries(new GarlicFries(new BasicFries()));
        FoodItem soda = new Soda(new BasicDrink());

        ArrayList<FoodItem> order = new ArrayList<FoodItem>();
        order.add(basic_burger);
        order.add(bbq_burger);
        order.add(veggie_burger);
        order.add(bbq_cheese_burger);
        order.add(animal_garlic_fries);
        order.add(soda);

        Order next_order = new Order(order, "supreme");
        System.out.println("Order Total: $" + next_order.calculateTotal());

    }
}
