package org.kwd.romanNumerals.calculator;

import java.util.Optional;

import static org.kwd.romanNumerals.calculator.RomanSymbols.*;

public class RomanNumeral {

    private String romanNumeral;
    private String thousandsString;
    private String hundredsString;
    private String tensString;
    private String unitsString;

    public RomanNumeral(String romanNumeral) {
        //is valid order
        if (doesRomanNumeralContainValidOrderedSymbols(romanNumeral)) {
            thousandsString = setThousandsString(romanNumeral);
            hundredsString = setHundredsString(romanNumeral);
            tensString = setTensString(romanNumeral);
            unitsString = setUnitsString(romanNumeral);
            this.romanNumeral = romanNumeral;
        } else {
            System.out.println("Invalid String - order");
        }
    }

    private String setThousandsString(String romanNumeral) {
        Optional<String> thousandsSection = extractSubSection(romanNumeral, M, M, M);
        if (thousandsSection.isPresent()) {
            String thousandsString = thousandsSection.get();
            if (RomanNumeralRulesValidator.validateThousandsSection(thousandsString)) {
                return thousandsString;
            }
            //TODO: throw exception
        }
        return "";
    }

    private String setHundredsString(String romanNumeral) {
        Optional<String> hundredsSection = extractSubSection(romanNumeral, D, C, M);
        if (hundredsSection.isPresent()) {
            String hundredsString = hundredsSection.get();
            if (RomanNumeralRulesValidator.validateHundredsSection(hundredsString)) {
                return hundredsString;
            }
            //TODO: throw exception
        }
        return "";
    }

    private String setTensString(String romanNumeral) {
        Optional<String> tensSection = extractSubSection(romanNumeral, L, X, C);
        if (tensSection.isPresent()) {
            String tenString = tensSection.get();
            if (RomanNumeralRulesValidator.validateTensSection(tenString)) {
                return tenString;
            }
            //TODO: throw exception
        }
        return "";
    }

    private String setUnitsString(String romanNumeral) {
        Optional<String> unitsSection = extractSubSection(romanNumeral, M, M, M);
        if (unitsSection.isPresent()) {
            String unitsString = unitsSection.get();
            if (RomanNumeralRulesValidator.validateUnitsSection(unitsString)) {
                return unitsString;
            }
            //TODO: throw exception
        }
        return "";
    }

    public String getRomanNumeral() {
        return romanNumeral;
    }

    public String getThousandsString() {
        return thousandsString;
    }

    public String getHundredsString() {
        return hundredsString;
    }

    public String getTensString() {
        return tensString;
    }

    public String getUnitsString() {
        return unitsString;
    }

    private boolean doesRomanNumeralContainValidOrderedSymbols(String romanNumeral) {
        return RomanNumeralRulesValidator.validateSymbolOrder(romanNumeral) ? true : false;
    }

    private Optional<String> extractSubSection(String romanNumeral, RomanSymbols... symbol) {
        int firstIndex = romanNumeral.indexOf(String.valueOf(symbol[0]));
        int secondIndex = romanNumeral.indexOf(String.valueOf(symbol[1]));
        int lastIndex = getLastIndex(secondIndex, romanNumeral);
        return getSubSections(romanNumeral, firstIndex, secondIndex, lastIndex, symbol);
    }

    //TODO: Refactor
    private Optional<String> getSubSections(String romanNumeral, int firstIndex, int secondIndex, int lastIndex, RomanSymbols... symbol) {
        if (firstIndex != -1) {
            if (firstIndex > 0 && (romanNumeral.substring(firstIndex - 1, firstIndex)).equals(String.valueOf(symbol[1]))) {
                return Optional.of(romanNumeral.substring(firstIndex - 1, firstIndex + 1));
            }
            if (secondIndex == -1) {
                return Optional.of(romanNumeral.substring(firstIndex, firstIndex + 1));
            }
            return Optional.of(romanNumeral.substring(firstIndex, lastIndex + 1));
        }
        if (secondIndex != -1) {
            if (secondIndex < romanNumeral.length()-1 && romanNumeral.valueOf(romanNumeral.charAt(secondIndex+1)).equals(String.valueOf(symbol[2]))) {
                return Optional.of(romanNumeral.substring(secondIndex, secondIndex + 2));
            }
            return Optional.of(romanNumeral.substring(secondIndex, lastIndex + 1));
        }
        return Optional.empty();
    }

    private static int getLastIndex(int index, String romanNumeral) {
        if (index == -1) return -1;
        for (int i = index; i < romanNumeral.length() - 1; i++) {
            char[] chars = romanNumeral.toCharArray();
            if (chars[i] != chars[i + 1]) {
                return i;
            }
        }
        return romanNumeral.length() - 1;
    }
}
