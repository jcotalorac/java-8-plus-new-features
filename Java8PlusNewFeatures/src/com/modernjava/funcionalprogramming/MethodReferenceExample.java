package com.modernjava.funcionalprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p1 = instructor -> instructor.isOnlineCourses();
        Predicate<Instructor> p2 = Instructor::isOnlineCourses;

        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        Function<Integer, Double> sqrt2 = Math::sqrt;
    }
}
