package org.kwd.romanNumerals.manager;

import org.kwd.romanNumerals.calculator.RomanNumeral;
import org.kwd.romanNumerals.calculator.RomanToDecimalConverter;

public class ConverterManager {

    public void convertRomanToDecimalNumber(String romanNumeralString) {
        RomanNumeral romanNumeral = new RomanNumeral(romanNumeralString);
        String validatedRomanNumeral = romanNumeral.getRomanNumeral();
        RomanToDecimalConverter converter = new RomanToDecimalConverter();
        int answer = converter.convertToDecimal(validatedRomanNumeral);
        System.out.println(answer);
    }

}
