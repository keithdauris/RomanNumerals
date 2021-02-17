package org.kwd.romanNumerals.manager;

import org.kwd.romanNumerals.calculator.RomanNumeralRulesValidator;
import org.kwd.romanNumerals.calculator.RomanToDecimalConverter;
import org.kwd.romanNumerals.calculator.RomanToDecimalConverterImpl;
import org.kwd.romanNumerals.calculator.RomanToDecimalConverterImpl2;

public class RomanNumeralManager {

    private final String INVALID_ROMAN_NUMERAL = "There is a problem with the Roman numeral submitted.\n" +
            "It may not contain any symbols, the symbols may be invalid or they might not be in the correct order";

    public void convertToDecimalNumber(String romanNumeralString){
        RomanToDecimalConverter converter = new RomanToDecimalConverterImpl();
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
