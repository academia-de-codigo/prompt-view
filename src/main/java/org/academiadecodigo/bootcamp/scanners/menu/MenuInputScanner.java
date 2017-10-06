package org.academiadecodigo.bootcamp.scanners.menu;

import org.academiadecodigo.bootcamp.scanners.integer.IntegerRangeInputScanner;

public class MenuInputScanner extends IntegerRangeInputScanner {

    private String[] options;

    public MenuInputScanner(String[] options) {

        super(1, options.length);

        this.options = options;
        super.setMessage(buildMenu(getMessage(), options));

    }

    @Override
    public void setMessage(String message) {
        super.setMessage(buildMenu(message, options));
    }

    private String buildMenu(String message, String[] options) {

        StringBuilder menuBuilder = new StringBuilder("\n");
        menuBuilder.append(message);
        menuBuilder.append("\n");

        for (int i = 0; i < options.length; i++) {
            menuBuilder.append("\n");
            menuBuilder.append(i + 1 + " - " + options[i]);
        }

        menuBuilder.append("\n> ");
        return menuBuilder.toString();

    }
}
