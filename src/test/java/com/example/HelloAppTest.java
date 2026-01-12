
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloAppTest {

    @Test
    void greetReturnsExpectedString() {
        String result = HelloApp.greet("Mahesh");
        assertEquals("Hello, Mahesh!", result);
    }
}
