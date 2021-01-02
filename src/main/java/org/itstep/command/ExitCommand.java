package org.itstep.command;

public class ExitCommand implements Command {
    @Override
    public void exp(String... s) {
        System.exit(0);
    }
}
