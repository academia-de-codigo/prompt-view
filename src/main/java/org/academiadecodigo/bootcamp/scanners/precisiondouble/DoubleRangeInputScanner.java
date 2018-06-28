package org.academiadecodigo.bootcamp.scanners.precisiondouble;

import java.util.Scanner;

public class DoubleRangeInputScanner extends DoubleInputScanner {

    private double min;
    private double max;

    public DoubleRangeInputScanner(double min, double max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasValidInput(Scanner input) {

        if (!super.hasValidInput(input)) {
            return false;
        }

        Double value = input.nextDouble();
        return value >= min && value <= max;
    }

    @Override
    public Double getUserInput(Scanner input) {

        // The token was already consumed by hasValidInput,
        // so we need to get it from the last matcher
        return Double.valueOf(input.match().group());
    }
}
