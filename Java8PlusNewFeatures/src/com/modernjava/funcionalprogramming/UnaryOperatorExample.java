package com.modernjava.funcionalprogramming;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unary = i -> i * 10;
        System.out.println(unary.apply(100));

        Function<Integer, Integer> function = i -> i * 10;
        System.out.println(function.apply(100));

        IntUnaryOperator intUnaryOperator = i -> i * 10;
        System.out.println(intUnaryOperator.applyAsInt(100));
    }
}
