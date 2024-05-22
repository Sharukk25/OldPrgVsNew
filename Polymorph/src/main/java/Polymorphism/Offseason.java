package Polymorphism;

public class Offseason {

	public void discount(double p) 
    {
        System.out.println("Total price of clothes during offseason: " + p);
        double discountPercentage = 15;
        double discount = p * (discountPercentage / 100);
        double discountedPrice = p - discount;
        System.out.println("Discounted price during offseason: " + discountedPrice);
    }
}
