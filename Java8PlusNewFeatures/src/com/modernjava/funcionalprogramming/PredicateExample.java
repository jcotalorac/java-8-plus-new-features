package com.modernjava.funcionalprogramming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i > 10;
        System.out.println(p1.test(100));
    }
}
