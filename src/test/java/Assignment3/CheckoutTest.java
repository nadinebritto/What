package Assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutTest {

    @Test
    void totalTax() {
        double tax = 0.26;
        Checkout checkout = new Checkout();
        checkout.totalCost();

        checkout.add(new IceCream("Strawberry Ice Cream", 1.45));
        checkout.add(new Sundae("Vanilla Ice Cream", 1.05, "Caramel", 0.50));
        checkout.add (new Candy("Gummy Worms", 1.33, 0.89));
        checkout.add (new Cookie("Chocolate Chip Cookies", 4, 3.99));
        checkout.add (new Candy("Salt Water Taffy", 1.5, 2.09));
        checkout.add (new Candy("Candy Corn", 3.0, 1.09));

        assertEquals(3.0988620000000004, checkout.totalTax());

    }
}