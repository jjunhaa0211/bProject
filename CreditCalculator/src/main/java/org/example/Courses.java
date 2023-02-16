package org.example;

import java.util.List;

public class Courses {

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplieditAdnCourseGrade() {
        double multipliedCreditAndCourseGrade = 0;
        for(Course course: courses) {
            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
        }

        return multipliedCreditAndCourseGrade;
    }

    public int calculateToTatalCompletedCredit() {


        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
