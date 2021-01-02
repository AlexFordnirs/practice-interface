package org.itstep.comand;

public class HelpCommand implements Command{
    @Override
    public void exp(String... s) {
        System.out.println("Help executed");
    }
}
