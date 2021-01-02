package org.itstep.comand;

public class Exit implements Command {
    @Override
    public void exp(String... s) {
        System.exit(0);
    }
}
