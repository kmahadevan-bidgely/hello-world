package com.superheroes;


import static org.testng.Assert.assertTrue;

import com.beust.ah.A;
import org.testng.Assert;
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
        Assert.assertEquals(app.getGreeting(), "hello Jack");
    }

    @Test
    public void testPrettyPrint() {
        App app = new App();
        app.setPerson("Po");
        Assert.assertEquals(app.getPerson(), "Po");
    }
}
