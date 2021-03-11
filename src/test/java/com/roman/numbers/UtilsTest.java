package com.roman.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTest {

    @Test
    public void testRomanNumberSubtractive() {
        assertEquals("IX", Utils.getRomanNumberValueSubtractive(9));
    }

    @Test
    public void testRomanNumberSubtractiveFourty() {
        assertEquals("XL", Utils.getRomanNumberValueSubtractive(40));
    }

    @Test
    public void testRomanNumberSubtractiveFourtyFive() {
        assertEquals("", Utils.getRomanNumberValueSubtractive(45));
    }

    @Test
    public void testRomanNumberAdditiveHighestValue() {
        assertEquals("MMMDCCCCLXXXXVIIII", Utils.getAdditiveValue(3999));
    }

    @Test
    public void testRomanNumberAdditiveTen() {
        assertEquals("X", Utils.getAdditiveValue(10));
    }

    @Test
    public void testRomanNumberAdditiveOutOfRange() {
        assertEquals("MMMM", Utils.getAdditiveValue(4000));
    }

    @Test
    public void testRomanNumberAdditiveThrowsNullPointerException() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Utils.getAdditiveValue(null);
        });
    }

    @Test
    public void testRomanNumberSubtractiveThrowsNullPointerException() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Utils.getRomanNumberValueSubtractive(null);
        });
    }


}



