package com.hillel.services;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Rounded {


    protected double Round(double round) {
        MathContext context = new MathContext(5, RoundingMode.HALF_UP);
        BigDecimal result = new BigDecimal(round, context);
        return result.doubleValue();
    }
}
