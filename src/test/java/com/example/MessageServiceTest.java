
package com.example;

import junit.framework.TestCase;

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