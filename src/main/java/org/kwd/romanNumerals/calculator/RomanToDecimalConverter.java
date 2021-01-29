package org.kwd.romanNumerals.calculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class RomanToDecimalConverter {

    public int convertToDecimal(String romanNumeral) {
        List<Integer> values = convertSymbolsToValues(romanNumeral);
        values = addRequiredNegativeValues(values);
        return values.stream()
                .reduce(0, Integer::sum);
    }

    private List<Integer> convertSymbolsToValues(String romanNumeral) {
        return Arrays.asList(romanNumeral.split(""))
                .stream()
                .map(letter -> RomanSymbols.valueOf(letter).getValue())
                .collect(toList());
    }

    private List<Integer> addRequiredNegativeValues(List<Integer> values) {
        IntStream.range(0, values.size() - 1)
                .forEach(i -> {
                            if (values.get(i) < values.get(i + 1)) {
                                values.set(i, -values.get(i));
                            }
                        }
                );
        return values;
    }
}
