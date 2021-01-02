package org.itstep.command;

public class TestComand {
    private Command command;
    public String tok;
    public void TestComanda (String str) {
        switch (str) {
            case "help":
                command = new HelpCommand();
                break;
            case "echo":
                command = new EchoCommand();
                break;
            case "now":
                command = new NowCommand();
                break;
            case "exit":
                command = new ExitCommand();
                break;
            default:
                command = new ErorrCommand();
                break;
        }

    }
     public  Command returnComand(){
         TestComanda(tok);
        return command;}
}
