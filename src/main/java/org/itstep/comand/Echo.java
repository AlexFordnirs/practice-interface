package org.itstep.comand;

public class Echo implements Command{
    @Override
    public void exp(String... s) {
        System.out.println("Hello World");
    }
}

