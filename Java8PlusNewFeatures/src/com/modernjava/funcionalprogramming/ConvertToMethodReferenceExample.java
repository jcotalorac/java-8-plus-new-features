package com.modernjava.funcionalprogramming;

import java.util.function.Predicate;

public class ConvertToMethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p2 = instructor -> instructor.getYearsOfExperience() > 10;
        Predicate<Instructor> p3 = ConvertToMethodReferenceExample::greaterThanTenYearsOfExperience;
    }

    public static boolean greaterThanTenYearsOfExperience(Instructor instructor) {
        return instructor.getYearsOfExperience() > 10;
    }
}
