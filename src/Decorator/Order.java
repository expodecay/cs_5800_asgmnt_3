package Decorator;

import java.util.ArrayList;

public class Order {
    ArrayList<FoodItem> order;
    int total;
    String loyalty_status;


    public Order(ArrayList<FoodItem> _order, String status){
        order = _order;
        loyalty_status = status;
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
        LoyaltyStatus loyalty = new LoyaltyStatus();
        int customer_discount = loyalty.discount(loyalty_status);
        total-= customer_discount;
        return total;
    }


}
