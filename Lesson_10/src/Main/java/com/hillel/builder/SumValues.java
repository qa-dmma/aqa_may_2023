package com.hillel.builder;

import static com.hillel.builder.DemoBuilder.valueA;
import static com.hillel.builder.DemoBuilder.valueB;

public class SumValues {
    public static StringBuilder Sum() {
        StringBuilder aPlusb = new StringBuilder();
        aPlusb.append(valueA);
        aPlusb.append(" + ");
        aPlusb.append(valueB);
        aPlusb.append(" = ");
        aPlusb.append(valueA + valueB);
        int indexChar = aPlusb.indexOf("=");
        aPlusb.deleteCharAt(indexChar);
        aPlusb.insert(indexChar, "равно");
        return aPlusb;
    }
}
