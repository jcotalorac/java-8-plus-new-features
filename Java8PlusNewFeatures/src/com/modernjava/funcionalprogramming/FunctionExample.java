package com.modernjava.funcionalprogramming;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        int x = 64;
        System.out.println("Square root of " + x + ": " + sqrt.apply(x));
    }
}
