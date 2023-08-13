package com.hillel.calc.calculator;

import org.testng.Assert;
import org.testng.annotations.*;


public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @BeforeTest
    public static void init() {
        System.out.println("All test are started");
    }

    @Test(groups = {"bygroup", "regression"})
    public void testSum() {
        int a = 15;
        int b = 2;
        int result = 17;
        int actualResult = calculator.sum(a, b);
        Assert.assertTrue(result == actualResult, "Actual result: " + actualResult + " Expected: " + result);

    }

    @Test(groups = {"bygroup", "regression"})
    public void testDivision() {
        int a = 15;
        int b = 3;
        int result = 5;
        int actualResult = calculator.division(a, b);
        Assert.assertEquals(result, actualResult, "Actual result: " + actualResult + " Expected: " + result);
    }

    @Test(groups = {"bygroup", "regression"})
    public void testMultiply() {
        int a = 15;
        int b = 3;
        int result = 45;
        int actualResult = calculator.multiply(a, b);
        Assert.assertEquals(result, actualResult, "Actual result: " + actualResult + " Expected: " + result);
    }

    @AfterTest
    public static void close() {
        System.out.println("All tests are finished");
    }
}
