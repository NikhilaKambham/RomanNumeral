package com.roman.numbers;

import java.util.HashMap;

public class Utils {

    /**
     * Calculates roman equivalent of a given Integer.
     * Given a number, checks if the number is closer to 10s,100s or 1000s place and subtracts the value accordingly
     * Else, iteratively subtracts the highest available roman value, extracts the value to String builder till number
     * becomes 0
     *
     * @param number
     * @return String equivalent of roman value
     */
    public static String getRomanNumberValue(Integer number) {
        StringBuilder builder = new StringBuilder();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");

        // example: 9 -> IX
        // 90 -> XC
        if (map.containsKey(number + 1)) {
            builder.append("I");
            builder.append(map.get(number + 1));
            return builder.toString();
        } else if (map.containsKey(number + 10)) {
            builder.append("X");
            builder.append(map.get(number + 10));
            return builder.toString();
        } else if (map.containsKey(number + 100)) {
            builder.append("C");
            builder.append(map.get(number + 100));
            return builder.toString();
        } else if (map.containsKey(number + 1000)) {
            builder.append("M");
            builder.append(map.get(number + 1000));
            return builder.toString();
        }
        while (number > 0) {
            if (number - 1000 >= 0) {
                builder.append(map.get(1000));
                number = number - 1000;
            } else if (number - 500 >= 0) {
                builder.append(map.get(500));
                number = number - 500;
            } else if (number - 100 >= 0) {
                builder.append(map.get(100));
                number = number - 100;
            } else if (number - 50 >= 0) {
                builder.append(map.get(50));
                number = number - 50;
            } else if (number - 10 >= 0) {
                builder.append(map.get(10));
                number = number - 10;
            } else if (number - 5 >= 0) {
                builder.append(map.get(5));
                number = number - 5;
            } else if (number - 1 >= 0) {
                builder.append(map.get(1));
                number = number - 1;
            }
        }
        return builder.toString();
    }

}
