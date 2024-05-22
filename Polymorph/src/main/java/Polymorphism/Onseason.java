package Polymorphism;

public class Onseason extends Offseason {

	public void discount(double p)
	{
		super.discount(250);
		System.out.println("Total price of clothes during onseason: " + p);
        double discountPercentage = 40;
        double discount = p * (discountPercentage / 100);
        double discountedPrice = p - discount;
        System.out.println("Discounted price during onseason: " + discountedPrice);
    }

    public static void main(String[] args) {
        Offseason offseason = new Offseason();
        Onseason onseason = new Onseason();
        onseason.discount(150);
    }
}