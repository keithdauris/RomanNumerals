package org.kwd.romanNumerals.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumeralRulesValidator {

    private static final String SYMBOL_ORDER_REGEX_PATTERN = "^M{0,3}C{0,1}D{0,1}C{0,3}M{0,1}X{0,1}L{0,1}X{0,3}C{0,1}I{0,1}V{0,1}I{0,3}X{0,1}$";
    private static final String THOUSANDS_REGEX_PATTERN = "^M{0,3}$";
    private static final String HUNDREDS_REGEX_PATTERN = "^(CD){0,1}$|^D{0,1}C{0,3}$|^(CM){0,1}$";
    private static final String TENS_REGEX_PATTERN = "^(XL){0,1}$|^L{0,1}X{0,3}$|^(XC){0,1}$";
    private static final String UNITS_REGEX_PATTERN = "^(IV){0,1}$|^V{0,1}I{0,3}$|^(IX){0,1}$";


    public static boolean validateSymbolOrder(String romanNumeral) {
        return isValidRegex(romanNumeral, SYMBOL_ORDER_REGEX_PATTERN);
    }

    public static boolean validateThousandsSection(String thousandsSection) {
        return isValidRegex(thousandsSection, THOUSANDS_REGEX_PATTERN);
    }

    public static boolean validateHundredsSection(String hundredsSection) {
        return isValidRegex(hundredsSection, HUNDREDS_REGEX_PATTERN);
    }

    public static boolean validateTensSection(String tensSection) {
        return isValidRegex(tensSection, TENS_REGEX_PATTERN);
    }

    public static boolean validateUnitsSection(String unitsSection) {
        return isValidRegex(unitsSection, UNITS_REGEX_PATTERN);
    }

    private static boolean isValidRegex(String romanNumeral, String regexPattern) {
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(romanNumeral);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

}