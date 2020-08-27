package com.modernjava.lambda;

import java.util.concurrent.Callable;
import java.util.stream.IntStream;

public class SumOfNumbersUsingCallable {
    public static int[] array = IntStream.rangeClosed(0, 5000).toArray();
    public static int total = IntStream.rangeClosed(0, 5000).sum();

    public static void main(String[] args) {
        Callable callable1 = () -> {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        };
    }
}
