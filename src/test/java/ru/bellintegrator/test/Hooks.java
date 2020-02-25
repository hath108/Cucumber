package ru.bellintegrator.test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    @Before(order = 1)
    public void start_01() {
        System.out.println("start_01");
    }

    @Before(order = 2)
    public void start_02() {
        System.out.println("start_02");
    }

    @After(order = 1)
    public void end_01() {
        System.out.println("\nend_01");
    }


}
