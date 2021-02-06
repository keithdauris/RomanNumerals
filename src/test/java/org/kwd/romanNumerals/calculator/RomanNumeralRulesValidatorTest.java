package org.kwd.romanNumerals.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralRulesValidatorTest {

    @Test
    void testThousand() {
        assertTrue(isValidNumber("M"));
    }

    @Test
    void testTwoThousand() {
        assertTrue(isValidNumber("MM"));
    }

    @Test
    void testThreeThousand() {
        assertTrue(isValidNumber("MMM"));
    }

    @Test
    void testNineHundred() {
        assertTrue(isValidNumber("CM"));
    }

    @Test
    void testNinety() {
        assertTrue(isValidNumber("XC"));
    }

    @Test
    void testNine() {
        assertTrue(isValidNumber("IX"));
    }

    @Test
    void testFourHundred() {
        assertTrue(isValidNumber("CD"));
    }

    @Test
    void testForty() {
        assertTrue(isValidNumber("XL"));
    }

    @Test
    void testFour() {
        assertTrue(isValidNumber("IV"));
    }

    @Test
    void testInvalidLetter() {
        assertFalse(isValidNumber("MMMCCCAXX"));
    }

    @Test
    void testInvalidNumber() {
        assertFalse(isValidNumber("MMMCCC4XX"));
    }

    @Test
    void testInvalidSymbol() {
        assertFalse(isValidNumber("MMMCCC*XX"));
    }

    @Test
    void testFull() {
    }

    private boolean isValidNumber(String romanNumeral) {
        return RomanNumeralRulesValidator.validateRomanNumeral(romanNumeral);
    }
}