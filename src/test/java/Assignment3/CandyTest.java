package Assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyTest {

    @Test
    void calculateItemCost() {
        String Candytest = "Vanilla Ice Cream";
        double price = 1.67;
        double amount = 0.74;

        Candy candy = new Candy(Candytest, price, amount);

        assertEquals(candy.CalculateItemCost(), 1.2358);
    }

    @Test
    void findSalesTax() {
        String Candytest = "Vanilla Ice Cream";
        double price = 1.67;
        double amount = 0.74;
        double tax = 1.2358 * 0.26;
        Candy candy = new Candy(Candytest, price, amount);

        assertEquals(tax, candy.findSalesTax());

    }

}

