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

    public<T> T getUserInput(InputScanner<T> prompt) {

        prompt.show(output);
        while (!prompt.hasValidInput(input)) {
            prompt.error(output);
            prompt.show(output);
            input.nextLine();
        }

        return prompt.getUserInput(input);
    }
}
