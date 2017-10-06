package org.academiadecodigo.bootcamp.scanners.string;

import java.util.Scanner;
import java.util.Set;

public class StringSetInputScanner extends StringInputScanner {

    private Set<String> stringSet;

    public StringSetInputScanner(Set<String> stringSet) {
        this.stringSet = stringSet;
    }


    @Override
    public boolean hasValidInput(Scanner input) {

        if (!super.hasValidInput(input)) {
            return false;
        }

        return stringSet.contains(input.match().group());

    }

    @Override
    public String getUserInput(Scanner input) {
        // The token was already consumed by hasValidInput,
        // so we need to get it from the last matcher
        return input.match().group();
    }
}
