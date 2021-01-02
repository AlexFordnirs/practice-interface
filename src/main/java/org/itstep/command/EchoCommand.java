package org.itstep.command;

public class EchoCommand implements Command{
    @Override
    public void execute(String... s) {
        System.out.println("Hello World");
    }
}

