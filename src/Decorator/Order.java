package Decorator;

import java.util.ArrayList;

public class Order {
    ArrayList<FoodItem> order;
    int total;
    double customer_discount = 0;

    public Order(ArrayList<FoodItem> _order){
        order = _order;
    }

    public int calculateTotal(){
        for (FoodItem item : order) {
            total += item.getCost();
        }
        total-= customer_discount;
        return total;
    }

    public double discount(String discount){
        if(discount == "basic"){
            customer_discount = 1;
        }
        if(discount == "special"){
            customer_discount = 2;
        }
        if(discount == "supreme"){
            customer_discount = 3;
        }
        return customer_discount;
    }
}
