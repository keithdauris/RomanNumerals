package org.kwd.romanNumerals.romansymbols;

public enum HundredsValues {

    C(100),
    CC(200),
    CCC(300),
    CD(400),
    D(500),
    DC(600),
    DCC(700),
    DCCC(800),
    CM(900);

    private int value;

    HundredsValues(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
