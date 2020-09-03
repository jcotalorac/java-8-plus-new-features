package com.modernjava.funcionalprogramming;

import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p1 = instructor -> instructor.isOnlineCourses();
    }
}
