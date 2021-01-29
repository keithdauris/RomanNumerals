package org.kwd.romanNumerals.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralRulesValidatorTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void testOrderValidation() {
        String rm = "MMMDCCCLXXXVIII";
        boolean status = RomanNumeralRulesValidator.validateSymbolOrder(rm);
        assertTrue(status);
    }

   /* @Test
    void testThousandsSection() {
        String rm = "MMMDCCCLXXXVIII";
        String thousands = RomanNumeralRulesValidator.getThousandsString(rm);
        assertEquals("MMM",thousands);
    }

    @Test
    void testHundredsSection() {
        String rm = "MMMCMXXIV";
        String hundreds = RomanNumeralRulesValidator.getHundredsString(rm);
        assertEquals("CM", hundreds);
    }

    @Test
    void testTensSection() {
        String rm = "MMMCMXXIV";
        String tens = RomanNumeralRulesValidator.getTensString(rm);
        assertEquals("XX", tens);
    }

    @Test
    void testUnitsSection() {
        String rm = "MMMCMXXIV";
        String units = RomanNumeralRulesValidator.getUnitsString(rm);
        assertEquals("IV", units);
    }*/
}