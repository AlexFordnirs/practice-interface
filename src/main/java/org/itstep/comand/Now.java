package org.itstep.comand;

public class Now implements Command{
    @Override
    public void exp(String... s) {
        System.out.println(System.currentTimeMillis());
    }
}
