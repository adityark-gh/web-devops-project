


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageServiceTest {

    @Test
    void shouldReturnWelcomeMessage() {
        String result = MessageService.getWelcomeMessage();

        assertEquals(
            "This is my web app working!",
            result
        );
    }
}