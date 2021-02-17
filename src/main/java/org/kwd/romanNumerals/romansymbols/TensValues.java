package org.kwd.romanNumerals.romansymbols;

public enum TensValues {

    X(10),
    XX(20),
    XXX(30),
    XL(40),
    L(50),
    LX(60),
    LXX(70),
    LXXX(80),
    XC(90);

    private int value;

    TensValues(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
