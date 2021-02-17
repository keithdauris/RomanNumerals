package org.kwd.romanNumerals.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToDecimalConverterTester {

    private RomanToDecimalConverterImpl converter;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        converter = new RomanToDecimalConverterImpl();
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