package org.academiadecodigo.bootcamp.scanners.integer;

import java.util.Scanner;
import java.util.Set;

public class IntegerSetInputScanner extends IntegerInputScanner {

    private Set<Integer> integerSet;

    public IntegerSetInputScanner(Set<Integer> integerSet) {
        this.integerSet = integerSet;
    }

    @Override
    public boolean hasValidInput(Scanner input) {

        if (!super.hasValidInput(input)) {
            return false;
        }

        Integer value = input.nextInt();
        return integerSet.contains(value);
    }

    @Override
    public Integer getUserInput(Scanner input) {

        // The token was already consumed by hasValidInput,
        // so we need to get it from the last matcher
        return Integer.valueOf(input.match().group());
    }
}
