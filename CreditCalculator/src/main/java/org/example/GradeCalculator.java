package org.example;

import java.util.List;

public class GradeCalculator {

    private final List<Course> coures;

    public GradeCalculator(List<Course> courses) {
        this.coures = courses;
    }

    public double calculateGrade() {
        double multipliedCreditAndCourseGrade = 0;
        for(Course course: coures) {
          multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
        }

        int totalCompletedCredit = coures.stream()
                .mapToInt(Course::getCredit)
                .sum();

        return multipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
