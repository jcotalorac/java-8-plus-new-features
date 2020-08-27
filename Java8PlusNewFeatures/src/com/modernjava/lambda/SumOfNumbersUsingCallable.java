package com.modernjava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class SumOfNumbersUsingCallable {
    public static int[] array = IntStream.rangeClosed(0, 5000).toArray();
    public static int total = IntStream.rangeClosed(0, 5000).sum();

    public static void main(String[] args) throws InterruptedException {
        Callable callable1 = () -> {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        };

        Callable callable2 = () -> {
            int sum = 0;
            for (int i = array.length / 2; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> tasks = Arrays.asList(callable1, callable2);
        List<Future<Integer>> results = executorService.invokeAll(tasks);
    }
}
