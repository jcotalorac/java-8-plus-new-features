package com.modernjava.funcionalprogramming;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        int x = 64;
        System.out.println("Square root of " + x + ": " + sqrt.apply(x));

        Function<String, String> lowerCaseFunction = s -> s.toLowerCase();
        String stringExample = "PROGRAMMING";
        System.out.println("Lower string of " + stringExample + ": " + lowerCaseFunction.apply(stringExample));

        Function<String, String> concatFunction = s -> s.concat(" In Java");
        System.out.println("Lower and concat of " + stringExample + ": " + lowerCaseFunction.andThen(concatFunction).apply(stringExample));
    }
}
