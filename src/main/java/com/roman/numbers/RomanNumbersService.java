package com.roman.numbers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * Service Class that calculates the roman equivalent of a given Integer
 *
 */
@Service
public class RomanNumbersService {

    Logger log = LoggerFactory.getLogger(RomanNumbersService.class);

    /**
     * Calculates roman number of given number
     * @param number of type Integer in the range of 1-3999
     * @return either JSON or String
     */
    public Object getRomanNumber(Integer number) {
        List<String> list = new ArrayList<>();
        if (number > 3999 || number < 1) {
            log.error("Invalid number range provided " + number);
            return "Integer not in the required range. Please provide Integer in the range of 1 and 3999";
        }
        log.info("Generating roman number for " + number);
        int i = 0;
        while (number > 0) {
            // get each digit of a number starting from the 0th place
            // example: for 192 -> 2,90,100 with 0, 1, 2 powers of 10 respectively
            Integer val = number % 10 * (int) Math.pow(10, i);
            if (val > 0) {
                String value = Utils.getRomanNumberValue(val);
                list.add(value);
            }
            number = number / 10;
            i++;
        }

        // Since we are getting the value from units place, we will need to revers the string to get the value
        // from left to right
        Collections.reverse(list);
        return String.join("", list);
    }
}
