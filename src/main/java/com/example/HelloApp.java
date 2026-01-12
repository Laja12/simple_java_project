
package com.example;

public class HelloApp {
    public static void main(String[] args) {
        System.out.println(greet("Harness"));
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
