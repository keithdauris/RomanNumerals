package org.kwd.romanNumerals.romansymbols;

public enum RomanNumeralPlaceholders {

    UNITS(1, new StringBuilder()),
    TENS(2, new StringBuilder()),
    HUNDREDS(3, new StringBuilder()),
    THOUSANDS(4, new StringBuilder());

    private int order;
    private StringBuilder placeholderValue;

    RomanNumeralPlaceholders(int order, StringBuilder placeholderValue) {
        this.order = order;
        this.placeholderValue = placeholderValue;
    }

    public StringBuilder getPlaceholderValue() {
        return placeholderValue;
    }

    public int getOrder() {
        return order;
    }
}
