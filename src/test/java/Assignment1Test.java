import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assignment1Test {

    @Test
    void add() {
        double first = 2;
        double second = 3;
        Assignment1 assignment1 = new Assignment1();
        double result = first + second;
        assertEquals(result, assignment1.add(2,3));
    }

    @Test
    void subtract() {
        double first = 9;
        double second = 6;
        Assignment1 assignment1 = new Assignment1();
        double result = first - second;
        assertEquals(result, assignment1.subtract(9,6));

    }

    @Test
    void multiply() {
        double first = 4;
        double second = 5;
        Assignment1 assignment1 = new Assignment1();
        double result = first * second;
        assertEquals(result, assignment1.multiply(4,5));
    }

    @Test
    void divide() {
        double first = 18;
        double second = 3;
        Assignment1 assignment1 = new Assignment1();
        double result = first / second;
        assertEquals(result, assignment1.divide(18,3));

    }
}

//Contact contact = new Contact("Craig Smith");
//       // contact.setName("Craig Smith");
//        contact.setPhone("801-555-1234");
//        contact.setEmail("whatever@gmail.com");
//        assertEquals("Name: Craig Smith  Phone:801-555-1234  Age: 0  Email: whatever@gmail.com", contact.print());
//        assertEquals("Craig Smith", contact.getName());
//    }