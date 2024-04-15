package org.example.calculate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * 요구사항
 * 간단한 사칙연산을 할 수 있다.
 * 양수로만 계산할 수 있다.
 * 나눗셈에서  0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
 * MVC패턴(Model-View-Controller) 기반으로 구현한다
 */
public class CalculatorTest {

    // 1 + 2 -----> Calculator
    //   3   <-----
    @DisplayName("사칙 연산을 정상적으로 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculateTest(PositiveNumber operand1, String operator, PositiveNumber operand2, int result) {
        int calculateResult = Calculator.calculate(operand1, operator, operand2);

        Assertions.assertEquals(result, calculateResult);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                arguments(new PositiveNumber(1), "+", new PositiveNumber(2), 3),
                arguments(new PositiveNumber(1), "-", new PositiveNumber(2), -1),
                arguments(new PositiveNumber(4), "*", new PositiveNumber(2), 8),
                arguments(new PositiveNumber(4), "/", new PositiveNumber(2), 2)
        );
    }

//    @DisplayName("나눗셈에서  0을 나누는 경우 IllegalArgument 예외를 발생시킨다.")
//    @Test
//    void calculateExceptionTest() {
//        assertThatCode(() -> Calculator.calculate(new PositiveNumber(10), "/", new PositiveNumber(0)))
//                .isInstanceOf(IllegalArgumentException.class)
//                .hasMessage("0또는 음수를 전달할 수 없습니다.");
//    }
}
