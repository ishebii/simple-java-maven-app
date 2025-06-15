package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
        System.out.println("Build triggered by Jenkins...");
        System.out.println("App started successfully!");
	System.out.println("App started successfully!");
        System.out.println("App started successfully!");
        System.out.println("App started successfully-111111!");

    }

    public String getMessage() {
        return MESSAGE;
    }
}
