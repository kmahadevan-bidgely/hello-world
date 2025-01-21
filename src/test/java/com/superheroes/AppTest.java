package com.superheroes;


import static org.testng.Assert.assertTrue;

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

    @Test(enabled = false)
    public void testGreeting() {
        App app = new App();
        app.setPerson("Jack");
        Assert.assertEquals(app.getGreeting(), "hello Jack");
    }
}
