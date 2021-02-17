package org.kwd.romanNumerals.calculator;

import org.kwd.romanNumerals.romansymbols.*;

import java.util.Arrays;
import java.util.List;

import static org.kwd.romanNumerals.romansymbols.RomanSymbols.valueOf;

public class RomanToDecimalConverterImpl2 implements RomanToDecimalConverter{

    public int convertToDecimal(String numeral) {
        RomanNumeralPlaceholders current = setInitialPlaceholder(numeral.substring(0,1));
        RomanNumeralPlaceholders placeholders = splitPlaceholders(current, numeral.substring(1));
        return sumPlaceholderValues(placeholders);
    }

    private RomanNumeralPlaceholders setInitialPlaceholder(String firstLetter) {
        valueOf(firstLetter).getPlaceholder().getPlaceholderValue().append(firstLetter);
        return valueOf(firstLetter).getPlaceholder();
    }

    private RomanNumeralPlaceholders splitPlaceholders(RomanNumeralPlaceholders current, String numeral) {
        List<String> letters = Arrays.asList(numeral.split(""));
        for (String letter : letters) {
            if (valueOf(letter).getPlaceholder().getOrder() < current.getOrder()) { //handles negation
                current = valueOf(letter).getPlaceholder();
            }
            current.getPlaceholderValue().append(letter);
        }
        return current;
    }

    private int sumPlaceholderValues(RomanNumeralPlaceholders placeholders) {
        int thousands = ThousandsValues.valueOf(RomanNumeralPlaceholders.THOUSANDS.getPlaceholderValue().toString()).getValue();
        int hundreds = HundredsValues.valueOf(RomanNumeralPlaceholders.HUNDREDS.getPlaceholderValue().toString()).getValue();
        int tens = TensValues.valueOf(RomanNumeralPlaceholders.TENS.getPlaceholderValue().toString()).getValue();
        int units = UnitValues.valueOf(RomanNumeralPlaceholders.UNITS.getPlaceholderValue().toString()).getValue();
        return thousands + hundreds + tens + units;
    }
}