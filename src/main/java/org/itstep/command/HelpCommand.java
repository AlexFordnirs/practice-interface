package org.itstep.command;

public class HelpCommand implements Command{
    @Override
    public void exp(String... args) {
        System.out.println("Help executed");
    }
}
