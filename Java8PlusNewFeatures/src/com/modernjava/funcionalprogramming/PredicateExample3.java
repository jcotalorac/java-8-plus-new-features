package com.modernjava.funcionalprogramming;

import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {
    public static void main(String[] args) {
        IntPredicate p1 = i -> i > 100;
        System.out.println(p1.test(100));

        LongPredicate p2 = l -> l > 100L;
        System.out.println(p2.test(11111L));
    }
}
