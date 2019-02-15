package Assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CookieTest {

    @Test
    void calculateItemCost() {
        String type = "Chocolate chip";
        double price = 5.87;
        double amount = 6;

        Cookie cookie = new Cookie(type, price, amount);
        assertEquals(cookie.CalculateItemCost(), 2.935);
    }

    @Test
    void findSalesTax(){
        String type = "Chocolate chip";
        double price = 5.87;
        double amount = 6;
        double tax = 2.935 * 0.26;

        Cookie cookie = new Cookie(type, price, amount);
        assertEquals(tax, cookie.findSalesTax());

    }
}