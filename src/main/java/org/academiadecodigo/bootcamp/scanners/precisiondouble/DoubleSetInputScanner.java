package org.academiadecodigo.bootcamp.scanners.precisiondouble;

import java.util.Scanner;
import java.util.Set;

public class DoubleSetInputScanner extends DoubleInputScanner {

    private Set<Double> doubleSet;

    public DoubleSetInputScanner(Set<Double> doubleSet) {
        this.doubleSet = doubleSet;
    }


    @Override
    public Double getUserInput(Scanner input) {

        // matched by the previous match.
        return Double.valueOf(input.match().group());
    }

    @Override
    public boolean hasValidInput(Scanner input) {

        if(!super.hasValidInput(input)){
            return false;
        }

        Double value = input.nextDouble();
        return doubleSet.contains(value);
    }
}
