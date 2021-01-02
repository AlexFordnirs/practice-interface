package org.itstep.command;

public class NowCommand implements Command{
    @Override
    public void exp(String... s) {
        System.out.println(System.currentTimeMillis());
    }
}
