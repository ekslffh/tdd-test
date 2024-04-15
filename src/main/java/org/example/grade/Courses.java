package org.example.grade;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();

//        double multipliedCreditAndCoursesGrade = 0;
//        for (Course course : courses) {
//            multipliedCreditAndCoursesGrade += course.multiplyCreditAndCourseGrade();
//        }
//        return multipliedCreditAndCoursesGrade;
    }

    public int calculateTotalCompletedCredit() {
        // 수강신청 총 학점수
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
