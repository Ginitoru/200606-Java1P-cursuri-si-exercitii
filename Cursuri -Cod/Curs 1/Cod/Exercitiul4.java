package com.company;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Exercitiul4 {

    public static void main(String[] args) {

        try {
             PrintStream printStream = new PrintStream("exercitiul4.txt");
             printStream.print("Hello, world!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
