package com.roman.numbers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RomanNumbersServiceTest {

    RomanNumbersService romanNumbersService = new RomanNumbersService();

    @Test
    public void testRomanNumberSubtractive() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode rootNode = mapper.createObjectNode();
        rootNode.put("input", 9);
        rootNode.put("output", "IX");
        assertEquals(rootNode, romanNumbersService.getRomanNumber(9));
    }

    @Test
    public void testRomanNumberHighest() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode rootNode = mapper.createObjectNode();
        rootNode.put("input", 3999);
        rootNode.put("output", "MMMCMXCIX");
        assertEquals(rootNode, romanNumbersService.getRomanNumber(3999));
    }

    @Test
    public void testRomanNumberOverRange() {
        assertEquals("Input not in the required range. Please provide Integer in the range of 1 and 3999", romanNumbersService.getRomanNumber(4000));
    }

    @Test
    public void testNullValueReturnsCorrectMessage() {
        assertEquals("null not allowed for this method", romanNumbersService.getRomanNumber(null));
    }

    @Test
    public void testZeroInoutGivesCorrectMessage() {
        assertEquals("Input not in the required range. Please provide Integer in the range of 1 and 3999", romanNumbersService.getRomanNumber(0));
    }
}
