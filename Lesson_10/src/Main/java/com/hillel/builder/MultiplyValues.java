package com.hillel.builder;

import static com.hillel.builder.DemoBuilder.valueA;
import static com.hillel.builder.DemoBuilder.valueB;

public class MultiplyValues {
    public static StringBuilder Multi() {
        StringBuilder aMultib = new StringBuilder();
        aMultib.append(valueA);
        aMultib.append(" * ");
        aMultib.append(valueB);
        aMultib.append(" = ");
        aMultib.append(valueA * valueB);
        int indexChar = aMultib.indexOf("=");
        aMultib.replace(indexChar, indexChar + 1, "равно");
        return aMultib;
    }
}
