package org.itstep.comand;

public class EchoCommand implements Command{
    @Override
    public void exp(String... s) {
        System.out.println("Hello World");
    }
}

