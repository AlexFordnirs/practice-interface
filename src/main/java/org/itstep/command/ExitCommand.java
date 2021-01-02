package org.itstep.command;

public class ExitCommand implements Command {
    @Override
    public void execute(String... s) {
        System.exit(0);
    }
}
