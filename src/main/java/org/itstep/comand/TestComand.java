package org.itstep.comand;

public class TestComand {
    private Command command;

    public void TestComand(String str) {
        switch (str) {
            case "help":
                command = new Help();
                break;
            case "echo":
                command = new Echo();
                break;
            case "now":
                command = new Now();
                break;
            case "exit":
                command = new Exit();
                break;
            default:
                command = new Eror();
                break;
        }

    }
     public  Command returnComand(){return command;}
}
