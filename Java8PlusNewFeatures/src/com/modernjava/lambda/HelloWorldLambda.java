package com.modernjava.lambda;

public class HelloWorldLambda {
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = () -> "Hello world";

        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
