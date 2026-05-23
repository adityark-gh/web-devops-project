
package com.example;

import junit.framework.TestCase;

public class MessageServiceTest extends TestCase {

   
    void testWelcomeMessage() {
        String result = MessageService.getWelcomeMessage();

        assertEquals(
            "This is my web app working!",
            result
        );
    }
}