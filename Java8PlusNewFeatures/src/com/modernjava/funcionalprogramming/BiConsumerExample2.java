package com.modernjava.funcionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        BiConsumer<String, String> biConsumer = (name, gender) -> System.out.println("name is: " + name + " and gender is: " + gender);
        instructors.forEach(instructor -> biConsumer.accept(instructor.getName(), instructor.getGender()));
    }
}
