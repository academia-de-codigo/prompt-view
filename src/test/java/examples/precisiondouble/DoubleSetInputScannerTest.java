package examples.precisiondouble;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.precisiondouble.DoubleSetInputScanner;

import java.util.HashSet;
import java.util.Set;

public class DoubleSetInputScannerTest {

    public static void main(String[] args) {

        double firstValue = 225.25;
        double secondValue = 403.14;

        Prompt prompt = new Prompt(System.in, System.out);
        Set<Double> options = new HashSet<>();
        options.add(firstValue);
        options.add(secondValue);

        DoubleSetInputScanner scanner = new DoubleSetInputScanner(options);
        scanner.setMessage("Insert one of " + firstValue + " " +  secondValue + " : ");
        scanner.setError("Invalid value!");
        System.out.println(prompt.getUserInput(scanner));

    }

}
