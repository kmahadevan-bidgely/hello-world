package com.superheroes;

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
}
