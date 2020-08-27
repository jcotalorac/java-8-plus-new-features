package com.modernjava.lambda;

import java.util.stream.IntStream;

public class SumOfNumbersUsingCallable {
    public static int[] array = IntStream.rangeClosed(0, 5000).toArray();
    public static int total = IntStream.rangeClosed(0, 5000).sum();
}
