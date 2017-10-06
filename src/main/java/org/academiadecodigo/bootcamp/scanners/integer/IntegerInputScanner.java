package org.academiadecodigo.bootcamp.scanners.integer;

import org.academiadecodigo.bootcamp.InputScanner;

import java.io.PrintStream;
import java.util.Scanner;

public class IntegerInputScanner implements InputScanner<Integer> {

    private String message = "Insert a number: ";
    private String error = "That is not a valid number!";

    public String getMessage() {
        return message;
    }

    public String getError() {
        return error;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public void show(PrintStream output) {
        output.print(message);
    }

    @Override
    public void error(PrintStream output) {
        output.println();
        output.println(error);
    }

    @Override
    public Integer getUserInput(Scanner input) {
        return input.nextInt();
    }

    @Override
    public boolean hasValidInput(Scanner input) {
        return input.hasNextInt();
    }
}
