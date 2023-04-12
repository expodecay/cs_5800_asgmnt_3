package Decorator;

public class LoyaltyStatus {

    int customer_discount = 0;

    public int discount(String discount){
        if(discount == "basic"){
            customer_discount = 1;
            System.out.println("Applying discout of $" + customer_discount);
        }
        if(discount == "special"){
            customer_discount = 2;
            System.out.println("Applying discout of $" + customer_discount);
        }
        if(discount == "supreme"){
            customer_discount = 3;
            System.out.println("Applying discout of $" + customer_discount);
        }
        return customer_discount;
    }
}
