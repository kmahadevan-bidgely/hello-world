package com.superheroes;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class App {

    private String user = "";

    public String getGreeting() {
        return "hello " + user;
    }

    public void setPerson(String user) {
        this.user = user;
    }

    public String getPerson() {
        return this.user;
    }

    public Map<String, String> getUserAttributes() {
        Map<String, String> result = new HashMap<>();
        result.put("name", user);
        return result;
    }
}
