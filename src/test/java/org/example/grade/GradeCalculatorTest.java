package org.example.grade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * 요구사항
 * 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
 * MVC패턴(Model-View-Controller) 기반으로 구현한다.
 * 일급 컬렉션 사용
 */
public class GradeCalculatorTest {
    // 학점 계산기 도메인: 이수한 과목, 학점 계산기
    // 이수과목 : 객체지향 프로그래밍, 자료구조, 중국어 회화 --> 과목(코스) 클래스

    /**
     * 핵심 포인트!
     */
    // 이수 과목을 전달하여 학점 계산을 요청한다 --> 학점 계산기 --> (학점수×교과목 평점)의 합계 --> 과목(코스) 일급 컬렉션
    //                                             --> 수강신청 총 학점수       --> 과목(코스) 일급 컬렉션


    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        Assertions.assertEquals(4.5, gradeResult);
    }
}
