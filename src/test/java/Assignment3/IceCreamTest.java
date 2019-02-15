package Assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamTest {

    @Test
    void calculateItemCost() {
        String type = "Mint";
        double price = 2.85;

        IceCream iceCream = new IceCream(type, price);
        assertEquals(iceCream.CalculateItemCost(), 2.85);
    }

    @Test
    void findSalesTax() {
        String type = "Mint";
        double price = 2.85;
        double tax = 0.26 * 2.85;

        IceCream iceCream = new IceCream(type, price);
        assertEquals(tax, iceCream.findSalesTax());
    }
}