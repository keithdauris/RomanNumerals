package org.kwd.romanNumerals.starter;

import org.kwd.romanNumerals.manager.ConverterManager;

public class Starter {

    public static void main(String[] args) {
        ConverterManager converterManager = new ConverterManager();
        converterManager.convertRomanToDecimalNumber("MMCCLXXVIII");

    }
}
