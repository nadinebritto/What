import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void print() {
        Contact contact = new Contact("Craig Smith");
       // contact.setName("Craig Smith");
        contact.setPhone("801-555-1234");
        contact.setEmail("whatever@gmail.com");
        assertEquals("Name: Craig Smith  Phone:801-555-1234  Age: 0  Email: whatever@gmail.com", contact.print());
        assertEquals("Craig Smith", contact.getName());
    }


    @Test
    void summaryPrint() {
        Contact contact = new Contact("Craig Smith");
        contact.setName("Craig Smith");
        contact.setPhone("801-555-1234");
        contact.setEmail("whatever@gmail.com");
        assertEquals("Name: Craig Smith  Phone:801-555-1234  Age: 0  Email: whatever@gmail.com", contact.print());
    }
}