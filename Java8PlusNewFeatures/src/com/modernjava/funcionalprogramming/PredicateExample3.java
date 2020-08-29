package com.modernjava.funcionalprogramming;

import java.util.function.IntPredicate;

public class PredicateExample3 {
    public static void main(String[] args) {
        IntPredicate p1 = i -> i > 100;
        System.out.println(p1.test(100));
    }
}
