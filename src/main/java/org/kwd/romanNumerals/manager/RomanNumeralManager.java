package org.kwd.romanNumerals.manager;

import org.kwd.romanNumerals.calculator.RomanNumeralRulesValidator;
import org.kwd.romanNumerals.calculator.RomanToDecimalConverter;
import org.kwd.romanNumerals.calculator.RomanToDecimalConverterImpl2;

public class RomanNumeralManager {

    private final String INVALID_ROMAN_NUMERAL = "There is a problem with the Roman numeral submitted.\n" +
            "There are either incorrect symbols being used or the symbols are not in the correct order";

    public void convertToDecimalNumber(String romanNumeralString){
        RomanToDecimalConverter converter = new RomanToDecimalConverterImpl2();
        if (RomanNumeralRulesValidator.validateRomanNumeral(romanNumeralString)) {
            printResult(converter.convertToDecimal(romanNumeralString), romanNumeralString);
        } else {
            printError();
        }
    }

    private void printError() {
        System.out.println(INVALID_ROMAN_NUMERAL);
    }

    private void printResult(int decimalValue, String romanNumeral) {
        System.out.println("The roman numeral, " + romanNumeral + " converts to " + decimalValue);
    }
}
