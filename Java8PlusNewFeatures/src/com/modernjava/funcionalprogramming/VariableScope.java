package com.modernjava.funcionalprogramming;

import java.util.function.IntConsumer;

public class VariableScope {
    public static void main(String[] args) {
        int b = 10;
        IntConsumer intConsumer = a -> System.out.println(a * 10);
    }
}
