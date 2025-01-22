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

    public Map<String, String> getUserAttributes(int level) {
        Map<String, String> result = new HashMap<>();
        result.put("name", user);
            result.put("level", Integer.toString(level));
        if (level == 1) {
            result.put("superpower", "disabled");
        }
        if (level >= 2) {
            result.put("superpower", "enabled");
            result.put("extra-lives", "enabled");
            result.put("extra-health", "enabled");
        }
        return result;
    }
}
