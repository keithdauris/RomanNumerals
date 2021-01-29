package org.kwd.romanNumerals.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToDecimalConverterTester {

    private RomanToDecimalConverter converter;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        converter = new RomanToDecimalConverter();
    }

    @Test
    public void testPositiveCalculation() {
        int value = converter.convertToDecimal("MMDCCLXXVIII");
        assertEquals(2778, value);
    }

    @Test
    public void testNegativeCalculation() {
        int value = converter.convertToDecimal("MMDCXCIV");
        assertEquals(2694, value);
    }
}