package com.example.jdiana.myapplication;

import com.google.common.collect.ImmutableSet;

public class MyAppClass {
    private static final ImmutableSet<String> COLOR_NAMES = ImmutableSet.of(
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "purple");

    public void doSomething() {
        System.out.println("Something!");
    }

    public void doSomethingElse() {
        System.out.println("Something else.");
    }
}
