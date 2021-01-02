package org.itstep;

import org.itstep.comand.TestComand;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-->");
        TestComand comand = new TestComand();
        comand.tok=scanner.nextLine();
        comand.returnComand().exp();
    }
}
