package Assignment3;

public class DessertShop {
    public static void main(String[] args){
        Checkout checkout = new Checkout();

        checkout.add(new IceCream("Strawberry Ice Cream", 1.45));
        checkout.add(new Sundae("Vanilla Ice Cream", 1.05, "Caramel", 0.50));
        checkout.add (new Candy("Gummy Worms", 1.33, 0.89));
        checkout.add (new Cookie("Chocolate Chip Cookies", 4, 3.99));
        checkout.add (new Candy("Salt Water Taffy", 1.5, 2.09));
        checkout.add (new Candy("Candy Corn", 3.0, 1.09));

        System.out.println("\n" + "Number of items: " + checkout.numberofItems() + "\n\n");
        System.out.printf("Total cost: $%.4f"  ,checkout.totalCost());
        System.out.println("\n\n");
        System.out.printf("Total Cost + Taxes: $%.5f" ,(checkout.totalCost() + checkout.totalTax()));
        System.out.println("\n\n");
        System.out.println(checkout);


        //System.out.println("Total Tax: " + checkout.totalTax());



    }
}
