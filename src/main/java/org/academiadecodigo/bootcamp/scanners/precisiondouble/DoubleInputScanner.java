package org.academiadecodigo.bootcamp.scanners.precisiondouble;

import org.academiadecodigo.bootcamp.InputScanner;

import java.io.PrintStream;
import java.util.Scanner;

public class DoubleInputScanner implements InputScanner<Double> {

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
    public Double getUserInput(Scanner input) {
        return input.nextDouble();
    }

    @Override
    public boolean hasValidInput(Scanner input) {
        return input.hasNextDouble();
    }
}
