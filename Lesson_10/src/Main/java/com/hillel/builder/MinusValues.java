package com.hillel.builder;

import static com.hillel.builder.DemoBuilder.valueA;
import static com.hillel.builder.DemoBuilder.valueB;

public class MinusValues {
    public static StringBuilder Minus() {
        StringBuilder aMinusb = new StringBuilder();
        aMinusb.append(valueA);
        aMinusb.append(" - ");
        aMinusb.append(valueB);
        aMinusb.append(" = ");
        aMinusb.append(valueA - valueB);
        int indexChar = aMinusb.indexOf("=");
        aMinusb.replace(indexChar, indexChar + 1, "равно");
        return aMinusb;
    }
}
