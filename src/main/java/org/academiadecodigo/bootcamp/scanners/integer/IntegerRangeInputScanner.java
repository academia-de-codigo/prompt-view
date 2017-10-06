package org.academiadecodigo.bootcamp.scanners.integer;

import java.util.Scanner;

public class IntegerRangeInputScanner extends IntegerInputScanner {

    private int min;
    private int max;

    public IntegerRangeInputScanner(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasValidInput(Scanner input) {

        if (!super.hasValidInput(input)) {
            return false;
        }

        Integer value = input.nextInt();
        return value >= min && value <= max;
    }

    @Override
    public Integer getUserInput(Scanner input) {

        // The token was already consumed by hasValidInput,
        // so we need to get it from the last matcher
        return Integer.valueOf(input.match().group());
    }
}
