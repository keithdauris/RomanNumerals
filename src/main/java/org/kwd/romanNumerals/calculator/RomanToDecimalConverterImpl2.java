package org.kwd.romanNumerals.calculator;

import org.kwd.romanNumerals.romansymbols.*;

import java.util.Arrays;
import java.util.List;

import static org.kwd.romanNumerals.romansymbols.RomanSymbols.valueOf;

public class RomanToDecimalConverterImpl2 implements RomanToDecimalConverter{

    public int convertToDecimal(String numeral) {
        RomanNumeralPlaceholders current = setInitialPlaceholder(numeral.substring(0,1));
        if (numeral.length()>1) {
            RomanNumeralPlaceholders placeholders = splitPlaceholders(current, numeral.substring(1));
            return sumPlaceholderValues(placeholders);
        }
        return sumPlaceholderValues(current);
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
        int sum = 0;
        String thousandsPlaceholder = RomanNumeralPlaceholders.THOUSANDS.getPlaceholderValue().toString();
        if (thousandsPlaceholder.length() > 0) {
            sum += ThousandsValues.valueOf(thousandsPlaceholder).getValue();
        }
        String hundredsPlaceholder = RomanNumeralPlaceholders.HUNDREDS.getPlaceholderValue().toString();
        if (hundredsPlaceholder.length() > 0) {
            sum += HundredsValues.valueOf(hundredsPlaceholder).getValue();
        }
        String tensPlaceholder = RomanNumeralPlaceholders.TENS.getPlaceholderValue().toString();
        if (tensPlaceholder.length() > 0) {
            sum += TensValues.valueOf(tensPlaceholder).getValue();
        }
        String unitsPlaceholder = RomanNumeralPlaceholders.UNITS.getPlaceholderValue().toString();
        if (unitsPlaceholder.length() > 0) {
            sum += UnitValues.valueOf(unitsPlaceholder).getValue();
        }
        return sum;
    }
}