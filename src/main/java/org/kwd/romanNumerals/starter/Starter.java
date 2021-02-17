package org.kwd.romanNumerals.starter;

import org.kwd.romanNumerals.calculator.DecimalToRomanNumeralConverter;
import org.kwd.romanNumerals.manager.RomanNumeralManager;

public class Starter {

    public static void main(String[] args) {
        RomanNumeralManager converterManager = new RomanNumeralManager();
        converterManager.convertToDecimalNumber("MMMCMLXXXVIII");
    }
}
