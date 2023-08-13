package com.hillel.calc.calculator;

import org.testng.annotations.DataProvider;

public class DataProviderInit {
    @DataProvider(name = "initDP")
    public Object[][] initData() {
        return new Object[][]{
                new Object[]{10, 3, 13},
                new Object[]{1, 3, 4},
                new Object[]{8, 10, 18},
                new Object[]{54, 31, 85}
        };
    }
}
