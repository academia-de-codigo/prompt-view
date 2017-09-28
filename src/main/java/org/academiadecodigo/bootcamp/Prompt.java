package org.academiadecodigo.bootcamp;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Prompt {

    private Scanner input;
    private PrintStream output;

    public Prompt(InputStream input, PrintStream output) {
        this.input = new Scanner(input);
        this.output = output;
    }

    public<T> T getUserInput(InputScanner<T> scanner) {

        scanner.show(output);
        while (!scanner.hasValidInput(input)) {
            scanner.error(output);
            scanner.show(output);
            input.nextLine();
        }

        return scanner.getUserInput(input);
    }
}
