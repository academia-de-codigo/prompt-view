package examples.string;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;

import java.util.HashSet;
import java.util.Set;

public class StringSetInputScannerTest {

    public static void main(String[] args) {

        Prompt prompt = new Prompt(System.in, System.out);
        Set<String> options = new HashSet<>();
        options.add("yes");
        options.add("no");

        StringSetInputScanner scanner = new StringSetInputScanner(options);
        scanner.setMessage("yes or no? ");
        scanner.setError("Invalid answer!");
        System.out.println(prompt.getUserInput(scanner));
    }
}
