package com.hillel.calc.calculator;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorDPTest {
    private Calculator calculator = new Calculator();

    @Test(dataProvider = "initDP", dataProviderClass = DataProviderInit.class)
    public void testSum(int a, int b, int result) {
        int actualResult = calculator.sum(a, b);
        Assert.assertTrue(result == actualResult, "Actual result: " + actualResult + " Expected: " + result);
    }


    @Test
    @Parameters({"parametr_A", "parametr_B", "parametr_Result"})
    public void testSumParam(int a, int b, int result) {
        int actualResult = calculator.sum(a, b);
        Assert.assertTrue(result == actualResult, "Actual result: " + actualResult + " Expected: " + result);
    }

}
