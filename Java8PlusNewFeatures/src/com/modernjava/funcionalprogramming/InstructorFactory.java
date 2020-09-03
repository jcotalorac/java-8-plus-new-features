package com.modernjava.funcionalprogramming;

import java.util.List;

public interface InstructorFactory {
    InstructorFactory getInstructor(String name, int yearsOfExperience, String title, String gender, boolean onlineCourses, List<String> courses);
}
