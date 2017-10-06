package examples.string;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class StringInputScannerTest {

    public static void main(String[] args) {

        Prompt prompt = new Prompt(System.in, System.out);
        StringInputScanner scanner = new StringInputScanner();

        System.out.println(prompt.getUserInput(scanner));

    }
}
