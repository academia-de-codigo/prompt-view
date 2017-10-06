package examples.menu;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public class MenuInputScannerTest {

    public static void main(String[] args) {

        String[] options = {"Deposit", "Withdraw"};

        Prompt prompt = new Prompt(System.in, System.out);
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage("Choose an option: ");

        System.out.println(prompt.getUserInput(scanner));

    }
}
