package org.kwd.romanNumerals.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumeralRulesValidator {

    private static final String ROMAN_NUMERAL_REGEX_PATTERN =
            "^M{0,3}(CD{0,1}|D{0,1}C{0,3}|(CM){0,1})(XL{0,1}|L{0,1}X{0,3}|XC{0,1})((IV){0,1}|V{0,1}I{0,3}|(IX){0,1})$";

    public static boolean validateRomanNumeral(String romanNumeral) {
        Pattern pattern = Pattern.compile(ROMAN_NUMERAL_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(romanNumeral);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
}