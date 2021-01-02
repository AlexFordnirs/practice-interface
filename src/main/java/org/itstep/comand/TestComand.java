package org.itstep.comand;

public class TestComand {
    private Command command;

    public static TestComand convert(String str){
        switch (str){
            case "help":
                  Help();
                break;
            case "echo":
                  Echo();
                break;
            case "now":
                  Now();
                break;
            case "exit":
                  Exit();
                break;
            default:
                  Eror();
                break;

        }
    }
}
