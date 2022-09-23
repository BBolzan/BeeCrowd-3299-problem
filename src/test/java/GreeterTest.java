package com.vogella.junit5;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class GreeterTest {
  
    Greeter greeter;

    @BeforeEach                                         
    void setUp() {
        greeter = new Greeter();
    }

    @Test
    public void greeterSaysHello() {
        assertEquals("Hello world!", greeter.sayHello());
    }

}