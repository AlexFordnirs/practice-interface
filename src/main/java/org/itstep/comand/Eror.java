package org.itstep.comand;

public class Eror implements Command{

    @Override
    public void exp(String... s) {
        System.out.println("Error");
    }
}