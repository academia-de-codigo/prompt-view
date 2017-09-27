package org.academiadecodigo.bootcamp;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @param <T>
 */
public interface InputScanner<T> {

    void show(PrintStream output);

    void error(PrintStream output);

    T getUserInput(Scanner input);

    boolean hasValidInput(Scanner input);
}
