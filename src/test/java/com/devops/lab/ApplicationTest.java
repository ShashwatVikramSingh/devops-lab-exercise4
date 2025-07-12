package com.devops.lab;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Application class
 */
public class ApplicationTest {
    
    private Application application;
    
    @BeforeEach
    public void setUp() {
        application = new Application();
    }
    
    @Test
    public void testGetGreeting() {
        String greeting = application.getGreeting();
        assertEquals("Hello from DevOps Lab!", greeting);
    }
    
    @Test
    public void testAddNumbers() {
        int result = application.addNumbers(5, 3);
        assertEquals(8, result);
    }
    
    @Test
    public void testAddNumbersWithNegatives() {
        int result = application.addNumbers(-5, 3);
        assertEquals(-2, result);
    }
}
