package org.itstep.command;

public class ErorrCommand implements Command{

    @Override
    public void execute(String... s) {
        System.out.println("Error");
    }
}