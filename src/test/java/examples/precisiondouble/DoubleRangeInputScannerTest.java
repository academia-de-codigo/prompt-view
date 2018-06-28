package examples.precisiondouble;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.precisiondouble.DoubleRangeInputScanner;

public class DoubleRangeInputScannerTest {

    public static void main(String[] args) {

        Prompt prompt = new Prompt(System.in, System.out);
        DoubleRangeInputScanner scanner = new DoubleRangeInputScanner(3.5, 6.5);

        System.out.println(prompt.getUserInput(scanner));

    }
}
