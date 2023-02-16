package org.example;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
       double totalMultipliedCreditAndCourseGrade = courses.multiplieditAdnCourseGrade();

       int totalCompletedCredit = courses.calculateToTatalCompletedCredit();

        return totalMultipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
