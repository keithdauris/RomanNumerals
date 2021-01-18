package org.kwd.romanNumerals.manager;

import org.kwd.romanNumerals.calculator.RomanToDecimalConverter;

public class ConverterManager {

    public void convertRomanToDecimalNumber(String romanNumeral) {
        RomanToDecimalConverter converter = new RomanToDecimalConverter();
        int answer = converter.convertToDecimal(romanNumeral);
        System.out.println(answer);
    }

}
