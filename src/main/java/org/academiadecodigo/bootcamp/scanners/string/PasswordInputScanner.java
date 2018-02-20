package org.academiadecodigo.bootcamp.scanners.string;

import java.io.Console;
import java.util.Scanner;

public class PasswordInputScanner extends StringInputScanner {

    private String password;

    @Override
    public String getUserInput(Scanner input) {

        if (password != null) {
            return password;
        }

        return super.getUserInput(input);
    }

    @Override
    public boolean hasValidInput(Scanner input) {

        Console console = System.console();

        if (System.console() != null) {
            password = String.valueOf(console.readPassword());
            return true;
        }

        return super.hasValidInput(input);
    }
}
