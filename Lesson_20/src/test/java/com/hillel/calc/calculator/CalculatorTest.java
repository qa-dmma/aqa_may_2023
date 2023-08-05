package com.hillel.calc.calculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void init() {
        System.out.println("All test are started");
    }

    @Test
    @DisplayName("Test sum a+b")
    public void testSum() {
        int a = 15;
        int b = 2;
        int result = 17;
        int actualResult = calculator.sum(a, b);
        Assertions.assertTrue(result == actualResult, "Actual result: " + actualResult + " Expected: " + result);

    }

    @Test
    @DisplayName("Test division a/b")
    public void testDivision() {
        int a = 15;
        int b = 3;
        int result = 5;
        int actualResult = calculator.division(a, b);
        Assertions.assertEquals(result, actualResult, "Actual result: " + actualResult + " Expected: " + result);
    }

    @Test
    @DisplayName("Test multiply a*b")
    public void testMultiply() {
        int a = 15;
        int b = 3;
        int result = 45;
        int actualResult = calculator.multiply(a, b);
        Assertions.assertTrue(result == actualResult, "Actual result: " + actualResult + " Expected: " + result);
    }

    @ParameterizedTest
    @MethodSource("getValues")
    @DisplayName("Parametrized test a*b+a/b")
    public void testMultuplyPlusDivision(int a, int b, int multiply, int division, int result) {
        int actualResult = calculator.multiply(a, b) + calculator.division(a, b);
        Assertions.assertEquals(result, actualResult, "Actual result: " + actualResult + " Expected: " + result);
    }

    public static Stream<Arguments> getValues() {
        return Stream.of(
                Arguments.of(4, 4, 16, 1, 17),
                Arguments.of(10, 5, 50, 2, 52),
                Arguments.of(20, 1, 20, 20, 40));
    }

    @AfterAll
    public static void close() {
        System.out.println("All tests are finished");
    }
}
