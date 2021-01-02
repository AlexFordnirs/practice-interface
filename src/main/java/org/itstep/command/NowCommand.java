package org.itstep.command;

public class NowCommand implements Command{
    @Override
    public void execute(String... s) {
        System.out.println(System.currentTimeMillis());
    }
}
