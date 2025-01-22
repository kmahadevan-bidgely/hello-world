package com.superheroes;



import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testSetUser() {
        App app = new App();
        app.setPerson("Jack");
    }

    @Test
    public void testGreeting() {
        App app = new App();
        app.setPerson("Jack");
        assertEquals(app.getGreeting(), "hello Jack");
    }

    @Test
    public void testPrettyPrint() {
        App app = new App();
        app.setPerson("Po");
        assertEquals(app.getPerson(), "Po");
    }

    @Test
    public void testGetUserAttributesLevel1() {
        App app = new App();
        app.setPerson("Dragon Warrior");
        Map<String, String> result = app.getUserAttributes(1);
        assertFalse(result.isEmpty());
        assertTrue(result.containsKey("level"));
    }
}
