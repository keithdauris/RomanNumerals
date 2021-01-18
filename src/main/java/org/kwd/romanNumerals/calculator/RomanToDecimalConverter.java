package org.kwd.romanNumerals.calculator;

public class RomanToDecimalConverter {

    public int convertToDecimal(String romanNumeral) {
        int sum = 0;
        //iterate through string
        char[] symbols = romanNumeral.toCharArray();
        for(Character symbol : symbols) {
            //check if subtraction notation
            sum += RomanSymbols.valueOf(symbol.toString()).getValue();
        }
        return sum;
    }
}
