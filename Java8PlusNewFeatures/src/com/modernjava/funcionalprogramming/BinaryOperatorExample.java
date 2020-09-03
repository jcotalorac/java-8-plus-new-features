package com.modernjava.funcionalprogramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(2, 4));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
        System.out.println(maxBi.apply(2, 4));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(2, 4));

        IntBinaryOperator intBi = (a, b) -> a * b;
        System.out.println(intBi.applyAsInt(2, 4));

        LongBinaryOperator longBi = (a, b) -> a * b;
        System.out.println(longBi.applyAsLong(2, 4));
    }
}
