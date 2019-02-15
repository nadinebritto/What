package Assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SundaeTest {

    @Test
    void calculateItemCost() {
        String type = "Mint";
        double price = 2.85;
        String topping = "Peanut Butter";
        double toppingPrice = 0.35;

        Sundae sundae = new Sundae(type, price, topping, toppingPrice);
        assertEquals(sundae.CalculateItemCost(), 3.20);
    }

    @Test
    void findSalesTax() {
        String type = "Mint";
        double price = 2.85;
        String topping = "Peanut Butter";
        double toppingPrice = 0.35;
        double tax = 0.26 * 3.20;

        Sundae sundae = new Sundae(type, price, topping, toppingPrice);
        assertEquals(tax, sundae.findSalesTax());
    }
}