package com.modernjava.funcionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        Consumer<Instructor> c1 = instructor -> System.out.println(instructor);
        instructors.forEach(c1);

        Consumer<Instructor> c2 = instructor -> System.out.println(instructor.getName());
        instructors.forEach(c2);

        Consumer<Instructor> c3 = instructor -> System.out.println(instructor.getCourses());
        instructors.forEach(c2.andThen(c3));

        instructors.forEach(instructor -> {
            if (instructor.getYearsOfExperience() > 10) {
                c2.accept(instructor);
            }
        });

        instructors.forEach(instructor -> {
            if (instructor.getYearsOfExperience() > 5 && instructor.isOnlineCourses()) {
                c2.andThen(i -> System.out.println(i.getYearsOfExperience())).accept(instructor);
            }
        });
    }
}
