package org.itstep.comand;

public class ErorrCommand implements Command{

    @Override
    public void exp(String... s) {
        System.out.println("Error");
    }
}