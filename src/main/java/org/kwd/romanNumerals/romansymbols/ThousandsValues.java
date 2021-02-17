package org.kwd.romanNumerals.romansymbols;

public enum ThousandsValues {

    M(1000),
    MM(2000),
    MMM(3000);

    private int value;

    ThousandsValues(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
