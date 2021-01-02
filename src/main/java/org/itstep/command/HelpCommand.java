package org.itstep.command;

public class HelpCommand implements Command{
    @Override
    public void execute(String... s) {
        System.out.print("Help executed");
    }
}
