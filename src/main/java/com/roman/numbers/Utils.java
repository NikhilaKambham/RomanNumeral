package com.roman.numbers;

import java.util.Map;

public class Utils {

    private static final Map<Integer, String> romanMap = Map.of(1, "I",
            5, "V", 10, "X", 50, "L", 100, "C", 500, "D", 1000, "M");


    /**
     * Given a number, checks if the number is closer to 10s,100s or 1000s place
     * Returns the subtractive roman value if exists. Else returns empty string
     *
     * @param number
     * @return String equivalent of closest roman value
     */
    public static String getRomanNumberValueSubtractive(Integer number) {
        StringBuilder builder = new StringBuilder();

        // example: 9 -> IX
        // 90 -> XC
        if (romanMap.containsKey(number + 1)) {
            builder.append("I");
            builder.append(romanMap.get(number + 1));
        } else if (romanMap.containsKey(number + 10)) {
            builder.append("X");
            builder.append(romanMap.get(number + 10));
        } else if (romanMap.containsKey(number + 100)) {
            builder.append("C");
            builder.append(romanMap.get(number + 100));
        } else if (romanMap.containsKey(number + 1000)) {
            builder.append("M");
            builder.append(romanMap.get(number + 1000));
        }
        return builder.toString();
    }


    /**
     * Subtracts the highest roman number iteratively and adds the equivalent String value as result
     *
     * @param number
     * @return Roman Equivalent of additive value
     */
    public static String getAdditiveValue(Integer number) {
        StringBuilder builder = new StringBuilder();
        while (number > 0) {
            if (number - 1000 >= 0) {
                builder.append(romanMap.get(1000));
                number = number - 1000;
            } else if (number - 500 >= 0) {
                builder.append(romanMap.get(500));
                number = number - 500;
            } else if (number - 100 >= 0) {
                builder.append(romanMap.get(100));
                number = number - 100;
            } else if (number - 50 >= 0) {
                builder.append(romanMap.get(50));
                number = number - 50;
            } else if (number - 10 >= 0) {
                builder.append(romanMap.get(10));
                number = number - 10;
            } else if (number - 5 >= 0) {
                builder.append(romanMap.get(5));
                number = number - 5;
            } else if (number - 1 >= 0) {
                builder.append(romanMap.get(1));
                number = number - 1;
            }
        }
        return builder.toString();
    }

}
