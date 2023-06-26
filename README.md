# Introduction

Example repo to show lifecycle changes between pico container 7.12.1 and 7.11.2.
Run with

     ./mvnw test


With 7.11.2:

    Started
    
    Scenario: first Scenario # features/SomeFeatures.feature:3
    Given create state     # org.example.SomeSteps.state()
    After
    Stopped
    Disposed
    Started
    
    Scenario: second Scenario # features/SomeFeatures.feature:6
    Given create state      # org.example.SomeSteps.state()
    After
    Stopped
    Disposed
    Started
    
    Scenario: third Scenario # features/SomeFeatures.feature:9
    Given create state     # org.example.SomeSteps.state()
    After
    Stopped
    Disposed

With 7.12.1:

    Started

    Scenario: first Scenario # features/SomeFeatures.feature:3
    Given create state     # org.example.SomeSteps.state()
    After
    Stopped
    Disposed

    Scenario: second Scenario # features/SomeFeatures.feature:6
    Given create state      # org.example.SomeSteps.state()
    After
    
    Scenario: third Scenario # features/SomeFeatures.feature:9
    Given create state     # org.example.SomeSteps.state()
    After
