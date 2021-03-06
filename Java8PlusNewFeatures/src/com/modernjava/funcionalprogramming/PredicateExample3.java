package com.modernjava.funcionalprogramming;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {
    public static void main(String[] args) {
        IntPredicate p1 = i -> i > 100;
        System.out.println(p1.test(100));

        LongPredicate p2 = l -> l > 100L;
        System.out.println(p2.test(11111L));

        DoublePredicate p3 = d -> d < 100.25;
        DoublePredicate p4 = d -> d > 100.10;
        System.out.println(p3.and(p4).test(100.15));
    }
}
