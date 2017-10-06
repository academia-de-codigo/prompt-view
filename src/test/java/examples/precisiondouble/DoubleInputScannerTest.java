package examples.precisiondouble;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.precisiondouble.DoubleInputScanner;

public class DoubleInputScannerTest {

    public static void main(String[] args) {

        Prompt prompt = new Prompt(System.in, System.out);
        DoubleInputScanner scanner = new DoubleInputScanner();

        System.out.println(prompt.getUserInput(scanner));

    }
}
