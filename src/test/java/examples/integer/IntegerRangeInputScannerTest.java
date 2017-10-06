package examples.integer;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerRangeInputScanner;

public class IntegerRangeInputScannerTest {

    public static void main(String[] args) {

        Prompt prompt = new Prompt(System.in, System.out);
        IntegerRangeInputScanner scanner = new IntegerRangeInputScanner(3, 6);

        System.out.println(prompt.getUserInput(scanner));

    }
}
