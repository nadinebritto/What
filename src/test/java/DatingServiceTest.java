import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatingServiceTest {

    @Test
    void whatShouldIDoOnMyDate() {
        DatingService datingService = new DatingService();

        assertEquals("Go to church", datingService.whatShouldIDoOnMyDate("Sunday"));
        assertEquals("Go to FHE", datingService.whatShouldIDoOnMyDate("Monday"));
    }
}