package Decorator;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        FoodItem basic_burger = new BasicBurger();
        basic_burger.assemble();
        //System.out.println("Cost: " + basic_burger.getCost());
        System.out.println();

        FoodItem bbq_burger = new BbqBurger(new BasicBurger());
        bbq_burger.assemble();
        //bbq_burger.getCost();
        System.out.println();

        FoodItem veggie_burger = new VeggieBurger(new BasicBurger());
        veggie_burger.assemble();
       // System.out.println(veggie_burger.getCost());
        System.out.println();

        FoodItem bbq_cheese_burger = new CheeseBurger(new BbqBurger(new BasicBurger()));
        bbq_cheese_burger.assemble();
        //bbq_cheese_burger.getCost();
       // System.out.println(bbq_cheese_burger.getCost());

        FoodItem animal_garlic_fries = new AnimalFries(new GarlicFries(new BasicFries()));
        animal_garlic_fries.assemble();

        FoodItem soda = new Soda(new BasicDrink());
        soda.assemble();

        ArrayList<FoodItem> order = new ArrayList<FoodItem>();
        order.add(basic_burger);
        order.add(bbq_burger);
        order.add(veggie_burger);
        order.add(bbq_cheese_burger);
        order.add(animal_garlic_fries);
        order.add(soda);

        Order next_order = new Order(order);
        next_order.discount("basic");
        System.out.println(next_order.calculateTotal());

    }
}
