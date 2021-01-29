package org.kwd.romanNumerals.manager;

import org.kwd.romanNumerals.calculator.RomanToDecimalConverter;

public class ConverterManager {

    public void convertRomanToDecimalNumber(String romanNumeral) {
        //Validate roman numeral - if valid then...

        RomanToDecimalConverter converter = new RomanToDecimalConverter();
        int answer = converter.convertToDecimal(romanNumeral);
        System.out.println(answer);
        //else advise error
    }

}
