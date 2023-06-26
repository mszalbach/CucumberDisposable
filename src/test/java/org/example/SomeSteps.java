package org.example;

import io.cucumber.java.en.Given;

public class SomeSteps {

    private final SomeState state;

    public SomeSteps(SomeState state) {

        this.state = state;
    }

    @Given("create state")
    public void state() {
    }

}
