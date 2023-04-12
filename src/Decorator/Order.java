package Decorator;

import java.util.ArrayList;

public class Order {
    ArrayList<FoodItem> order;
    int total;


    public Order(ArrayList<FoodItem> _order){
        order = _order;
    }

    public int calculateTotal(){
        int i = 0;
        for (FoodItem item : order) {
            System.out.println("Item: " + i);
            item.assemble();
            System.out.println();
            total += item.getCost();
            i++;
        }
        System.out.println("Total: $" + total);
        LoyaltyStatus discount = new LoyaltyStatus();
        double customer_discount = discount.discount("supreme");
        total-= customer_discount;
        return total;
    }


}
