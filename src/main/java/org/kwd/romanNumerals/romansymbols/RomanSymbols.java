package org.kwd.romanNumerals.romansymbols;

import org.kwd.romanNumerals.romansymbols.RomanNumeralPlaceholders;

import static org.kwd.romanNumerals.romansymbols.RomanNumeralPlaceholders.*;

public enum RomanSymbols {

    I(1, UNITS),
    V(5, UNITS),
    X(10, TENS),
    L(50, TENS),
    C(100, HUNDREDS),
    D(500, HUNDREDS),
    M(1000, THOUSANDS);

    private int value;
    private RomanNumeralPlaceholders placeholder;

    RomanSymbols(int value, RomanNumeralPlaceholders placeholder) {
        this.value = value;
        this.placeholder = placeholder;
    }

    public int getValue() {
        return value;
    }

    public RomanNumeralPlaceholders getPlaceholder() {
        return placeholder;
    }
}
