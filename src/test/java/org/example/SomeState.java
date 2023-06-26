package org.example;

import org.picocontainer.Disposable;
import org.picocontainer.Startable;

import io.cucumber.java.After;

public class SomeState implements Disposable, Startable {

    @Override
    public void dispose() {
        System.out.println("Disposed");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @Override
    public void start() {
        System.out.println("Started");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }
}
