package org.kwd.romanNumerals.romansymbols;

public enum UnitValues {
    I(1),
    II(2),
    III(3),
    IV(4),
    V(5),
    VI(6),
    VII(7),
    VIII(8),
    IX(9);

    private int value;

    UnitValues(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
