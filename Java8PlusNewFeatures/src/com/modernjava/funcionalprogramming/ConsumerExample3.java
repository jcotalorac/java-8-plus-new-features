package com.modernjava.funcionalprogramming;

import java.util.function.IntConsumer;

public class ConsumerExample3 {
    public static void main(String[] args) {
        IntConsumer intConsumer = a -> System.out.println(a * 10);
        intConsumer.accept(10);
    }
}
