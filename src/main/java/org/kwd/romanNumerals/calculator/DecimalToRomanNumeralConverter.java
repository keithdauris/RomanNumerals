package org.kwd.romanNumerals.calculator;

public class DecimalToRomanNumeralConverter {

    public void convertToRomanNumeral() {
        int num = 1000;
        RomanSymbols[] values = RomanSymbols.values();
        for (RomanSymbols value:values) {
            int i = value.getValue();
            if( num == i) {
                System.out.println(value.toString());
            }
        }

    }
}
